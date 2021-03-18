package warriors.engine;

public class Event {
    protected String name;
    protected int pointsDeVie;
    protected int pointsAttaque;
    protected String type;

    public Event() {
        this.name = "vide";
        this.type = "vide";
    }

    public Event(String name, int pointsAttaque, int pointsDeVie, String type) {
        this.name = name;
        this.pointsDeVie = pointsDeVie;
        this.pointsAttaque = pointsAttaque;
        this.type = type;
    }

    public int getAttackLevel() {
        return pointsAttaque;
    }

    public String getName() {
        return name;
    }

    public int getLifeLevel() {
        return pointsDeVie;
    }

    public String getType() {
        return type;
    }

}
//    public void setLifeLevel(int pointsDeVie) {
//        this.pointsDeVie = pointsDeVie;
//    }