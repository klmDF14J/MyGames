package roboyobo.launcher;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import roboyobo.launcher.state.MainMenuState;
import roboyobo.launcher.state.SplashScreenState;
import roboyobo.launcher.util.Reference;

public class Launcher extends StateBasedGame {

	public static AppGameContainer app;
	
	public Launcher() {
		super("Launcher");
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		addState(new SplashScreenState(Reference.splashScreenState));
		addState(new MainMenuState(Reference.mainMenuState));
		enterState(Reference.splashScreenState);
	}
	
	public static void main(String[] args) throws SlickException {
		app = new AppGameContainer(new Launcher());
		app.setDisplayMode(Reference.screenSizeWidth, Reference.screenSizeHeight, false);
		app.start();
	}

}
