package warriors.engine;
import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;

public class GameState implements warriors.contracts.GameState {
    private String playerName;
    private GameStatus gameStatus;
    private Hero hero;
    private Map map;
    private String lastLog;
    private int currentSquare;

    public GameState(String playerName, Hero hero, Map map) {
        this.playerName = playerName;
        this.hero = hero;
        this.map = map;
        this.lastLog = "Début de partie";
        this.currentSquare = 1;
        this.gameStatus = gameStatus.IN_PROGRESS;
    }

    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String getGameId() {
        return "boulzouba";
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    @Override
    public Hero getHero() {
        return hero;
    }

    @Override
    public Map getMap() {
        return map;
    }

    @Override
    public String getLastLog() {
        return lastLog;
    }

    @Override
    public int getCurrentSquare() {
        return currentSquare;
    }

    public void setGameStatus(GameStatus newStatus) {
        this.gameStatus = newStatus;
    }

    public void setLastLog(String newLog) {
        this.lastLog = newLog;
    }

    public void setCurrentSquare(int newSquare) {
        this.currentSquare = newSquare;
    }



}
