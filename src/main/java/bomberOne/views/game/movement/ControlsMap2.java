package bomberOne.views.game.movement;

import java.util.HashMap;
import java.util.Map;

import bomberOne.controllers.game.GameController;
import bomberOne.model.input.Player;
import bomberOne.model.input.commands.MoveDown;
import bomberOne.model.input.commands.MoveLeft;
import bomberOne.model.input.commands.MoveRight;
import bomberOne.model.input.commands.MoveUp;
import bomberOne.model.input.commands.PlantBomb;
import bomberOne.model.user.Controls;
import bomberOne.views.View;

public class ControlsMap2 {

    private static final int KEY_D = 68;
    private static final int KEY_A = 65;
    private static final int KEY_S = 83;
    private static final int KEY_W = 87;
    private static final int KEY_ARROW_RIGHT = 39;
    private static final int KEY_ARROW_LEFT = 37;
    private static final int KEY_ARROW_DOWN = 40;
    private static final int KEY_ARROW_UP = 38;
    private static final int KEY_SPACE_BAR = 32;

    private Map<Integer, Runnable> controlMap;
    private View view;

    public ControlsMap2(final Controls type, final View view) {
        this.controlMap = new HashMap<>();
        this.view = view;
        if (type.equals(Controls.ARROW)) {
            this.initArrowsControls();
        } else {
            this.initWasdControls();
        }
        this.controlMap.put(KEY_SPACE_BAR,
                () -> ((GameController) this.view.getController()).getCommandListener().addCommand(new PlantBomb()));
    }

    /**
     * Initialize the map if the User chose the "Arrow" Controls.
     */
    private void initArrowsControls() {
        this.controlMap.put(KEY_ARROW_UP,
                () -> ((GameController) this.view.getController()).getCommandListener().addCommand(new MoveUp()));
        this.controlMap.put(KEY_ARROW_DOWN,
                () -> ((GameController) this.view.getController()).getCommandListener().addCommand(new MoveDown()));
        this.controlMap.put(KEY_ARROW_LEFT,
                () -> ((GameController) this.view.getController()).getCommandListener().addCommand(new MoveLeft()));
        this.controlMap.put(KEY_ARROW_RIGHT,
                () -> ((GameController) this.view.getController()).getCommandListener().addCommand(new MoveRight()));
    }

    /**
     * Initialize the map if the User chose the "Wasd" Controls.
     */
    private void initWasdControls() {
        this.controlMap.put(KEY_W,
                () -> Player.setToggleUpPressed(true));
        this.controlMap.put(KEY_S,
                () -> Player.setToggleDownPressed(true));
        this.controlMap.put(KEY_A,
                () -> Player.setToggleLeftPressed(true));
        this.controlMap.put(KEY_D,
                () -> Player.setToggleRightPressed(true));
    }

    /**
     * 
     * @return the controllMap
     */
    public Map<Integer, Runnable> getControlMap() {
        return this.controlMap;
    }
}
