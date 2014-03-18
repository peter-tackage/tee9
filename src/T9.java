import java.util.HashMap;

public class T9 {

    private static HashMap<Character, Integer> sT9MAP = new HashMap<Character, Integer>();

    static {
        sT9MAP.put('a', 2);
        sT9MAP.put('b', 2);
        sT9MAP.put('c', 2);

        sT9MAP.put('d', 3);
        sT9MAP.put('e', 3);
        sT9MAP.put('f', 3);

        sT9MAP.put('g', 4);
        sT9MAP.put('h', 4);
        sT9MAP.put('i', 4);

        sT9MAP.put('j', 5);
        sT9MAP.put('k', 5);
        sT9MAP.put('l', 5);

        sT9MAP.put('m', 6);
        sT9MAP.put('n', 6);
        sT9MAP.put('o', 6);

        sT9MAP.put('p', 7);
        sT9MAP.put('q', 7);
        sT9MAP.put('r', 7);
        sT9MAP.put('s', 7);

        sT9MAP.put('t', 8);
        sT9MAP.put('u', 8);
        sT9MAP.put('v', 8);

        sT9MAP.put('w', 9);
        sT9MAP.put('x', 9);
        sT9MAP.put('y', 9);
        sT9MAP.put('z', 9);
    }

    public static int toDigit(char c) {
        return sT9MAP.get(c);
    }
}
