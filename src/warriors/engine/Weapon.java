package warriors.engine;

public class Weapon extends Surprise {

    public Weapon(String name, int pointsAttaque) {
        this.name = name;
        this.pointsAttaque = pointsAttaque;
        this.type = "arme";
    }

    @Override
    public String toString() {
        return "Super vous avez trouvez une arme est : " + name + ", elle vous apporte " + pointsAttaque + " points d'attaque";
    }
}
