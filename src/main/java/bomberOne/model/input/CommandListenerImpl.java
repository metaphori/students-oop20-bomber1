package bomberOne.model.input;

import java.util.LinkedList;
import java.util.List;

import bomberOne.model.GameModel;
import bomberOne.model.input.commands.Command;
/**
 * That class is the CommandListner of the game.
 *
 */
public class CommandListenerImpl implements CommandListener {
        private List<Command> commandList;
        private GameModel game;

        public CommandListenerImpl() {
            this.commandList = new LinkedList<>();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void addCommand(final Command command) {
            this.commandList.add(command);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public List<Command> getCommandList() {
            return this.commandList;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void executeAll() {
            this.commandList.stream().forEach(i -> {
                i.execute(this.game);
            });
            this.commandList.clear();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void setGameModel(final GameModel game) {
            this.game = game;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public GameModel getGameModel() {
            return this.game;
        }
}