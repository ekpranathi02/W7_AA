public class Character {
    private int health;
    private final int maxHealth;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth; // start at full health
    }

    public void takeDamage(int amount) {
        int newHealth = health - amount;
        health = Math.max(newHealth, 0); // clamp at 0
    }

    public void heal(int amount) {
        int newHealth = health + amount;
        health = Math.min(newHealth, maxHealth); // clamp at max
    }

    public int getHealth() {
        return health;
    }

    public static void main(String[] args) {
        Character c = new Character(100);
        System.out.println(c.getHealth());   // 100
        c.takeDamage(30);
        System.out.println(c.getHealth());   // 70
        c.heal(50);
        System.out.println(c.getHealth());   // 100 (capped)
        c.takeDamage(150);
        System.out.println(c.getHealth());   // 0 (floored)
    }
}