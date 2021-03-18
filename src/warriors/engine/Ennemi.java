package warriors.engine;

public class Ennemi extends Event {

    public Ennemi(String name, int pointsAttaque, int pointsDeVie){
        super(name, pointsAttaque, pointsDeVie, "ennemi");
    }

    @Override
    public String toString() {
        return "C'est un " + name + " il a " + pointsAttaque + " points d'attaque et " + pointsDeVie + " points de vie";
    }
}
