package warriors.engine;

public class Potion extends Surprise {

    public Potion (String name, int pointsDeVie){
        this.name=name;
        this.pointsDeVie = pointsDeVie;
        this.type = "potion";
    }

    @Override
    public String toString() {
        return "Super vous avez trouvez une potion: " + name + ", elle vous apporte " + pointsDeVie + " points de vie";
    }



}
