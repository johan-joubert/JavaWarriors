package warriors.engine;

public class Warrior extends LocalHero {

    public static final int MAXLIFE = 10;
    public static final int MAXATTACK = 10;

    public Warrior (String name, int attack, int life) {
        super(name, life, attack);
    }

    @Override
    public int getMaxLife() {
        return MAXLIFE;
    }

    @Override
    public int getMaxAttack() {
        return MAXATTACK;
    }

}
