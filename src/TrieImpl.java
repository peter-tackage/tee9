import java.util.PriorityQueue;

public class TrieImpl implements Trie {

    private Node root;

    public TrieImpl() {
        root = new T9Node(0);
    }

    @Override
    public void insert(String value) {
        root.insert(value);
    }

    @Override
    public PriorityQueue<String> match(String key) {
        return root.retrieve(key);
    }
}
