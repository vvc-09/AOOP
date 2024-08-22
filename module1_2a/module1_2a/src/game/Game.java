package game;

public class Game {
	public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        System.out.println("Current Level: " + gameState.getCurrentLevel());
        System.out.println("Difficulty: " + gameState.getDifficulty());

        // Factory Method for creating enemies
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy goblin = enemyFactory.createEnemy("Goblin");
        goblin.attack();

        Enemy troll = enemyFactory.createEnemy("Troll");
        troll.attack();

        // Abstract Factory for creating items
        ItemFactory itemFactory = new BasicItemFactory();
        Weapon sword = itemFactory.createWeapon();
        sword.use();

        PowerUp healthPotion = itemFactory.createPowerUp();
        healthPotion.apply();

        gameState.nextLevel();
        System.out.println("Next Level: " + gameState.getCurrentLevel());
    }
}
