import java.util.PriorityQueue;

public abstract class Node {
    public abstract void insert(String value);

    public abstract PriorityQueue<String> retrieve(String key);
}
