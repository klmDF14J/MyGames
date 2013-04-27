package roboyobo.weekendGame.Entity;

import java.awt.Point;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

import roboyobo.weekendGame.loader.TextureLoader;
import roboyobo.weekendGame.player.HealthManager;
import roboyobo.weekendGame.state.wave.Wave1State;
import roboyobo.weekendGame.util.Reference;

public class Zombie extends Entity {
	
	public java.awt.Rectangle bounds;
	public int ID;
	public float health = 50;
	public boolean isDead = false;
   public Zombie(float position, float position2, int ID) {
      super(position, position2);
      this.ID = ID;
   }

   @Override
   public void update(GameContainer container, StateBasedGame game, int delta) {
	   if(!this.isDead) {
	   bounds = new java.awt.Rectangle( (int) position, (int) position2, 100, 100);
	   if(this.position < Reference.playerX && !bounds.getBounds().intersectsLine(Reference.playerX, Reference.playerY, Reference.playerX + Reference.lineSizeX, Reference.playerY + 100)) {
	   this.position += Reference.wave1MovementSpeed;
	   }
	   
	   else if(this.position > Reference.playerX && !bounds.getBounds().intersectsLine(Reference.playerX, Reference.playerY, Reference.playerX + Reference.lineSizeX, Reference.playerY + 100)) {
		   this.position -= Reference.wave1MovementSpeed;
	   }
	   
	  
	   if(bounds.getBounds().intersectsLine(Reference.playerX, Reference.playerY, Reference.playerX + Reference.lineSizeX, Reference.playerY + 100)) {
		   HealthManager.dealDamage(HealthManager.getHealthLossBasedOnMob("Zombie"));
	   }
	   
	   if(bounds.getBounds().intersectsLine(Reference.playerX, Reference.playerY, Reference.playerX + Reference.lineSizeX, Reference.playerY + 100) && Reference.isAttacking) {
		   if(position > Reference.playerX && Reference.attackDirection == "right") {
		   health -= Reference.swordDamageDealt;
		   }
	   }
	   if(health <= 0) {
		   this.isDead = true;
	   }
	   }
   }

   @Override
   public void render(GameContainer container, StateBasedGame game, Graphics graphics) {
	   graphics.drawLine(Reference.playerX, Reference.playerY, Reference.playerX + Reference.lineSizeX, Reference.playerY + 100);
	   if(!this.isDead) {
     TextureLoader.zombie.draw(position, position2, Reference.mobScaleFactor);
	   }
	   else {
		   
	   }
   }

   @Override
   public void shoot(GameContainer container, float cameraX, float cameraY) {
      // TODO Auto-generated method stub
   }
   
}