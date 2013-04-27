package roboyobo.weekendGame.player;

import roboyobo.weekendGame.util.Reference;

public class HealthManager {
	public static float getHealthLossBasedOnMob(String mob) {
		float healthLoss = 0;
		if(mob == "Zombie") {
			healthLoss = 0.005F;
		}
		else {
			healthLoss = 0F;
		}
		return healthLoss;
	}
	
	public static void dealDamage(float damage) {
		if(Reference.playerHealth > 0) {
		Reference.playerHealth -= damage;
		}
	}
}
