import java.util.PriorityQueue;

public class Main {

    public static void main(String args[]) {

        Trie trie = new TrieImpl();
        trie.insert("a");
        trie.insert("b");
        trie.insert("g");
        trie.insert("good");
        trie.insert("goo");
        trie.insert("goofy");
        trie.insert("home");
        trie.insert("cat");

        PriorityQueue<String> results = trie.match("4");
        System.out.println("4 => " + results);
        results = trie.match("46");
        System.out.println("46 => " + results);
        results = trie.match("466");
        System.out.println("466 => " + results);
        results = trie.match("4663");
        System.out.println("4663 => " + results);

        System.out.println("###############");

        results = trie.match("2");
        System.out.println("4 => " + results);
    }
}
