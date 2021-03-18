package warriors.engine;

import warriors.contracts.*;
import warriors.contracts.GameState;
import warriors.contracts.Hero;
import warriors.contracts.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Warriors implements WarriorsAPI {
    private List<Hero> listeHeros;
    private List<Map> listeMap;
    warriors.engine.GameState gameState;
    int resultatDe;

    public Warriors() {
        this.listeHeros = new ArrayList<>();
        Hero nouveauHeros1 = new Warrior("Alex", 4, 4);
        Hero nouveauHeros2 = new Warrior("Jo", 6, 3);
        Hero nouveauHeros3 = new Wizard("Hugo", 8, 5);
        Hero nouveauHeros4 = new Wizard("Zouboulba", 9, 6);
        listeHeros.add(nouveauHeros1);
        listeHeros.add(nouveauHeros2);
        listeHeros.add(nouveauHeros3);
        listeHeros.add(nouveauHeros4);

        this.listeMap = new ArrayList<>();
        warriors.engine.Map nouvelleMap1 = new warriors.engine.Map("SouvigneMap", 64);

        Weapon arc = new Weapon("arc", 1);
        Square caseArc = new Square(arc);
        Weapon massue = new Weapon("massue", 3);
        Square caseMassue = new Square(massue);
        Weapon epee = new Weapon("epee",5);
        Square caseEpee = new Square(epee);
        Spell eclair = new Spell("eclair",  2);
        Square caseEclair = new Square(eclair);
        Spell bouledefeu = new Spell("boule de feu",  7);
        Square caseBouleDeFeu = new Square(bouledefeu);
        Potion potionMineure = new Potion("potion mineure", 1);
        Square casePotionMineure = new Square(potionMineure);
        Potion potionStandard = new Potion("potion standard", 2);
        Square casePotionstandard = new Square(potionStandard);
        Potion potionGrande = new Potion("grande potion", 5);
        Square caseGrandePotion = new Square(potionGrande);

        Event vide = new Event();
        Square CaseVide = new Square(vide);

        nouvelleMap1.addToPlateau(CaseVide, 0);
        nouvelleMap1.addToPlateau(caseEclair, 1);
        nouvelleMap1.addToPlateau(caseArc, 2);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 3);
        nouvelleMap1.addToPlateau(caseEclair, 4);
        nouvelleMap1.addToPlateau(caseMassue, 5);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 6);
        nouvelleMap1.addToPlateau(casePotionMineure, 7);
        nouvelleMap1.addToPlateau(caseEclair, 8);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 9);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 10);
        nouvelleMap1.addToPlateau(caseArc, 11);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 12);
        nouvelleMap1.addToPlateau(casePotionMineure, 13);
        nouvelleMap1.addToPlateau(caseArc, 14);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 15);
        nouvelleMap1.addToPlateau(CaseVide, 16);
        nouvelleMap1.addToPlateau(caseEclair, 17);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 18);
        nouvelleMap1.addToPlateau(caseArc, 19);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 20);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 21);
        nouvelleMap1.addToPlateau(caseMassue, 22);
        nouvelleMap1.addToPlateau(caseEclair, 23);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 24);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 25);
        nouvelleMap1.addToPlateau(caseArc, 26);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 27);
        nouvelleMap1.addToPlateau(casePotionMineure, 28);
        nouvelleMap1.addToPlateau(casePotionMineure, 29);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("gobelin", 1, 6)), 30);
        nouvelleMap1.addToPlateau(casePotionstandard, 31);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 32);
        nouvelleMap1.addToPlateau(casePotionMineure, 33);
        nouvelleMap1.addToPlateau(CaseVide, 34);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 35);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 36);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 37);
        nouvelleMap1.addToPlateau(caseMassue, 38);
        nouvelleMap1.addToPlateau(casePotionstandard, 39);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 40);
        nouvelleMap1.addToPlateau(caseGrandePotion, 41);
        nouvelleMap1.addToPlateau(caseEpee, 42);
        nouvelleMap1.addToPlateau(casePotionstandard, 43);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 44);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("dragon", 4, 15)), 45);
        nouvelleMap1.addToPlateau(CaseVide, 46);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("sorcier", 2, 9)), 47);
        nouvelleMap1.addToPlateau(caseBouleDeFeu, 48);
        nouvelleMap1.addToPlateau(caseBouleDeFeu, 49);
        nouvelleMap1.addToPlateau(CaseVide, 50);
        nouvelleMap1.addToPlateau(CaseVide, 51);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("dragon", 4, 15)), 52);
        nouvelleMap1.addToPlateau(caseEpee, 53);
        nouvelleMap1.addToPlateau(CaseVide, 54);
        nouvelleMap1.addToPlateau(CaseVide, 55);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("dragon", 4, 15)), 56);
        nouvelleMap1.addToPlateau(CaseVide, 57);
        nouvelleMap1.addToPlateau(CaseVide, 58);
        nouvelleMap1.addToPlateau(CaseVide, 59);
        nouvelleMap1.addToPlateau(CaseVide, 60);
        nouvelleMap1.addToPlateau(CaseVide, 61);
        nouvelleMap1.addToPlateau(new Square(new Ennemi("dragon", 4, 15)), 62);
        nouvelleMap1.addToPlateau(CaseVide, 63);
        nouvelleMap1.addToPlateau(CaseVide, 64);
        listeMap.add(nouvelleMap1);
    }



    @Override
    public List<Hero> getHeroes() {
        return listeHeros;
    }

    @Override
    public List<Map> getMaps() {
        return listeMap;
    }

    @Override
    public GameState createGame(String playerName, Hero hero, Map map) {
        gameState = new warriors.engine.GameState(playerName, hero, map);
        return gameState;
    }

    @Override
    public GameState nextTurn(String gameID) {
        warriors.engine.Map map = (warriors.engine.Map) gameState.getMap();
        String message = "";
        //générer un résultat de dé entre 1 et 6               pas de system out, stocker dans lastlog
        resultatDe = lancerDe();
        Hero hero = gameState.getHero();
        //déplacer le perso et afficher la case actuelle
        gameState.setCurrentSquare(gameState.getCurrentSquare() + resultatDe);
        if (gameState.getCurrentSquare() >= 64) {
            gameState.setCurrentSquare(64);
            message ="Vous avez fait un " + resultatDe + " et vous êtes sur la case " + gameState.getCurrentSquare() + ", vous êtes arrivés";
            gameState.setGameStatus(GameStatus.FINISHED);
        } else {
            Square currentSquare = map.getSquareContent(gameState.getCurrentSquare());
            String currentSquareType = currentSquare.getEvent().getType();
            message = "Vous avez fait un " + resultatDe + " et vous êtes sur la case " + gameState.getCurrentSquare()+ "\n C'est une case " + currentSquareType;

            switch(currentSquareType) {
                case "ennemi":
                    Event ennemi = currentSquare.getEvent();
                    message += "\n" + ennemi.toString();
                    break;
                case "potion":
                    Event potion = currentSquare.getEvent();
                    message += "\n" + potion.toString();

                    ((LocalHero) hero).setLifeLevel(hero.getLife() + potion.getLifeLevel());

                    if (hero.getLife() > ((LocalHero) hero).getMaxLife()) {
                        ((LocalHero) hero).setLifeLevel(((LocalHero) hero).getMaxLife());
                    }

                    message += "\nVotre vie est maintenant de " + hero.getLife();

                    break;
                case "sort":
                    Spell sort = new Spell(currentSquare.getEvent().getName(), currentSquare.getEvent().getAttackLevel());
                    message = "\n" + sort.toString();
                    if (hero instanceof Wizard) {
                        ((LocalHero) hero).deleteSort();
                        ((LocalHero) hero).setSpell(sort);
                        message = message + "\nVous etes sur une case sort, c'est un " + sort.getName() + ", il vous octroie +" + sort.getAttackLevel() + " points d'attaque";
                        ((LocalHero) hero).setAttackLevel(hero.getAttackLevel() + sort.getAttackLevel());
                        if (hero.getAttackLevel() > ((LocalHero) hero).getMaxAttack()){
                            ((LocalHero) hero).setAttackLevel(((LocalHero) hero).getMaxAttack());
                            message = message + "\nVotre niveau d'attaque est au maximum !";
                        }
                    } else {
                        message = message + "\nVous etes sur une case sort, c'est un(e) " + sort.getName() + ", il (elle) vous est inutile";
                    }
                    break;
                case "arme":
                    Event arme = currentSquare.getEvent();
                    message = "\n" + arme.toString();
                    if (hero instanceof Warrior) {
                        ((LocalHero) hero).deleteArme();
                        ((LocalHero) hero).setArme(arme);
                        message = message + "\nVous etes sur une case arme, c'est une " + arme.getName() + ", elle vous octroie +" + arme.getAttackLevel() + " points d'attaque";
                        ((LocalHero) hero).setAttackLevel(hero.getAttackLevel() + arme.getAttackLevel());
                        if (hero.getAttackLevel() > ((LocalHero) hero).getMaxAttack()){
                            ((LocalHero) hero).setAttackLevel(((LocalHero) hero).getMaxAttack());
                            message = message + "\nVotre niveau d'attaque est au maximum !";
                        }
                    } else {
                        message = message + "\nVous etes sur une case arme, c'est une " + arme.getName() + ", elle vous est inutile";
                    }
                    break;
                default:
                    message += "\n avance fainéant !";
                    break;
            }
        }
        gameState.setLastLog(message);
        return gameState;
    }

    private int lancerDe() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}