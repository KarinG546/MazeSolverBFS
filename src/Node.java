import java.util.ArrayList;
import java.util.List;

public class Node {

    private int x;
    private int y;
    private List<Node> neighbours;


    public Node(int x, int y) {
        this.x = x;
        this.y = y;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbour (Node neighbour){
        this.neighbours.add(neighbour);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }
}
