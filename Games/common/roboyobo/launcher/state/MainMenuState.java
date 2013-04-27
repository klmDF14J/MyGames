package roboyobo.launcher.state;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import roboyobo.launcher.Launcher;
import roboyobo.launcher.util.Reference;

public class MainMenuState extends State {
	
	public MainMenuState(int StateID) {
		super(StateID);
	}
	
	private Image background;
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		background = new Image("/resources/images/launcher/Background.png");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		//background.draw(0, 0);
		g.setBackground(Color.blue);
		g.fillRect(Reference.x, Reference.y, Reference.gameBoxSizeX, Reference.gameBoxSizeY);
		g.fillRect(Reference.x + 150, Reference.y, Reference.gameBoxSizeX, Reference.gameBoxSizeY);
		g.fillRect(Reference.x + 300, Reference.y, Reference.gameBoxSizeX, Reference.gameBoxSizeY);
		g.fillRect(Reference.x, Reference.y + 100, Reference.gameBoxSizeX, Reference.gameBoxSizeY);
		g.fillRect(Reference.x + 150, Reference.y + 100, Reference.gameBoxSizeX, Reference.gameBoxSizeY);
		g.fillRect(Reference.x + 300, Reference.y + 100, Reference.gameBoxSizeX, Reference.gameBoxSizeY);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}

}
