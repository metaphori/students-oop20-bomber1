package bomberone.views.rules;

import bomberone.tools.ResourcesLoader;
import bomberone.views.ViewType;
import bomberone.views.ViewsSwitcher;
import bomberone.views.basic.ViewImpl;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

public class RulesViewImpl extends ViewImpl implements RulesView {

    @FXML
    private Label rules;

    @FXML
    private Label textPU;

    @FXML
    private Label textPU1;

    @FXML
    private Label textPU2;

    @FXML
    private Label textPU3;

    @FXML
    private Label textPU4;

    @FXML
    private Label textPU5;

    @FXML
    private Label textCommands;

    private Font arcade20;
    private Font arcade16;

    @Override
    public void init() {
        this.arcade20 = ResourcesLoader.getFont(20);
        this.arcade16 = ResourcesLoader.getFont(16);
        this.rules.setFont(arcade20);
        this.textPU.setFont(arcade20);
        this.textPU1.setFont(arcade16);
        this.textPU2.setFont(arcade16);
        this.textPU3.setFont(arcade16);
        this.textPU4.setFont(arcade16);
        this.textPU5.setFont(arcade16);
    }

    @FXML
    public final void switchToHome() {
        ViewsSwitcher.switchWithoutController(this.getStage(), ViewType.HOME);
    }
}
