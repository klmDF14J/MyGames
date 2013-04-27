package roboyobo.weekendGame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import roboyobo.launcher.state.SplashScreenState;
import roboyobo.weekendGame.loader.TextureLoader;
import roboyobo.weekendGame.state.LaunchScreenState;
import roboyobo.weekendGame.state.MenuState;
import roboyobo.weekendGame.state.wave.Wave1State;
import roboyobo.weekendGame.util.Reference;

public class WeekendGame extends StateBasedGame {

	public static AppGameContainer app;
	
	public WeekendGame() {
		super("Weekend Game");
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		TextureLoader.loadAllTextures();
		addState(new LaunchScreenState());
		addState(new MenuState());
		addState(new Wave1State());
		enterState(Reference.launchScreenState);
	}
	
	public static void main(String[] args) throws SlickException {
		app = new AppGameContainer(new WeekendGame());
		app.setDisplayMode(1000, 600, false);
		app.start();
		
	}
	
	@Override
	public void mousePressed(int button, int x, int y) {
		if(button == Input.MOUSE_LEFT_BUTTON && Reference.currentWave == 1) {
		Reference.mouseX = x;
		Reference.mouseY = y;
		Wave1State.checkMouseCoords();
		}
	}
	
}
