package bomberone.model.gameObjects;

import java.awt.image.BufferedImage;

import bomberone.model.common.P2d;

public class HardWall extends GameObjectImpl {

	public HardWall(P2d pos, BufferedImage img, int lifes) {
		super(pos, img, lifes);
	}

	@Override
	public void update(int elapsed) {
	}

}
