package warriors.engine;

public class Wizard extends LocalHero {

    public static final int MAXLIFE = 6;
    public static final int MAXATTACK = 15;

    public Wizard(String name, int attack, int life) {
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

    public void setSort(Spell spell)
    {
        this.spell = spell;
    }

}
