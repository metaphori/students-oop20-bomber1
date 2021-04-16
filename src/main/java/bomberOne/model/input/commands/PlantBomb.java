package bomberOne.model.input.commands;

import bomberOne.model.GameModel;

public class PlantBomb implements Command{

	@Override
	public void execute(GameModel gameModel) {
		gameModel.getWorld().getBomber().plantBomb();		
	}

}