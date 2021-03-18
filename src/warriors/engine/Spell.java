package warriors.engine;

public class Spell extends Surprise {

    public Spell(String name, int pointsAttaque) {
        this.name = name;
        this.pointsAttaque = pointsAttaque;
        this.type = "sort";
    }

    @Override
    public String toString() {
        return "Super vous avez trouvez un sort : " + name + ", elle vous apporte " + pointsAttaque + " points d'attaque";
    }

}
