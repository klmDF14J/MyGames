package roboyobo.weekendGame.loader;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import roboyobo.weekendGame.util.Reference;

public class TextureLoader {
	public static SpriteSheet mobs;
	public static SpriteSheet healthBar;
	
	public static Image zombie;
	public static Image healthBar1, healthBar2, healthBar3, healthBar4, healthBar5, healthBar6, healthBar7, healthBar8, healthBar9, healthBar10, healthBar11;
	public static Image[] healthBarImages = {healthBar1, healthBar1, healthBar2, healthBar3, healthBar4, healthBar5, healthBar6, healthBar7, healthBar8, healthBar9, healthBar10, healthBar11};
	public static Image gameBackground;
	public static Image gameFloor;
	public static Image playerBoy;
	public static Image playerGirl;
	public static Image button;
	public static Image menuBackground;
	
	public static void loadAllTextures() throws SlickException {
		loadSpriteSheets();
		loadImagesFromSpriteSheets();
		loadIndividualImagesFromFile();
	}
	
	public static void loadSpriteSheets() throws SlickException {
		mobs = new SpriteSheet(Reference.imagesDirectory + "/mobs/Mobs.png", 32, 32);
		healthBar = new SpriteSheet(Reference.imagesDirectory + "/framework/Health Bar.png", 32, 32);
	}
	
	public static void loadImagesFromSpriteSheets() {
		zombie = mobs.getSprite(3, 0);
		for(int i = 0; i < 10; i++) {
		healthBarImages[i] = healthBar.getSprite(i, 0);
		}	
	}
	
	public static void loadIndividualImagesFromFile() throws SlickException {
		gameBackground = new Image(Reference.imagesDirectory + "/framework/Background.png");
		gameFloor = new Image(Reference.imagesDirectory + "/framework/Floor.png");
		playerBoy = new Image(Reference.imagesDirectory + "/characters/BoyPlayer.png");
		playerGirl = new Image(Reference.imagesDirectory + "/characters/GirlPlayer.png");
		button = new Image(Reference.imagesDirectory + "/framework/Button.png");
		menuBackground = new Image(Reference.imagesDirectory + "/framework/Menu.png");
	}
}
