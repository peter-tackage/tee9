import java.util.PriorityQueue;

public interface Trie {
    public void insert(String value);

    public PriorityQueue<String> match(String key);
}
