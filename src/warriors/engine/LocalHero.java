package warriors.engine;

public abstract class LocalHero implements warriors.contracts.Hero {
    protected String heroName;
    protected int lifeLevel;
    protected int attackLevel;
    protected Weapon weapon;
    protected Spell spell;

    public LocalHero (String name, int attack, int level) {
        heroName = name;
        lifeLevel = level;
        attackLevel = attack;
    }

    @Override
    public String getName() {
        return heroName;
    }

    @Override
    public int getLife() {
        return lifeLevel;
    }

    @Override
    public int getAttackLevel() {
        return attackLevel;
    }


    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public void setAttackLevel(int setAttackLevel) {
        this.attackLevel = setAttackLevel;
    }

    public abstract int getMaxLife();

    public abstract int getMaxAttack();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setArme(Weapon weapon)
    {
        this.weapon = weapon;
    }

    public void setSpell(Spell spell)
    {
        this.spell = spell;
    }

    public void deleteArme(){
        if (this.weapon != null) {
            attackLevel = attackLevel - weapon.getAttackLevel();
        }
    }

    public void deleteSort(){
        if (this.spell != null) {
            attackLevel = attackLevel - spell.getAttackLevel();
        }
    }

}
