package warriors.engine;
import java.util.List;
import java.util.ArrayList;


public class Map implements warriors.contracts.Map {
    private String name;
    private int numberOfSquares;
    private List<Square>mapSquares;

    public Map (String name, int numberOfSquares) {
        this.name = name;
        this.numberOfSquares = numberOfSquares;
        this.mapSquares = new ArrayList<>();
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfSquares() {
        return numberOfSquares;
    }

    public void addToPlateau(Square square, int index){
        mapSquares.add(index, square);
    }

    public Square getSquareContent(int index) {
        return mapSquares.get(index);
    }



}
