import java.util.PriorityQueue;

public class T9Node extends Node {

    private PriorityQueue<String> mValues;
    private Node[] mChildren;
    private final int mLevel;

    public T9Node(int level) {
        mLevel = level;
    }

    @Override
    public void insert(String value) {

        if(value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty");
        }

        if(mLevel == value.length()) {
            // At the end of the prefix - insert the value
            if(mValues == null) mValues = new PriorityQueue<String>();
            System.out.println("Inserting value: " + value + " at level: " + mLevel);
            mValues.add(value);
        } else {
            if(mChildren == null) mChildren = new Node[10];

            // Find the appropriate index for the first character
            int index = T9.toDigit(value.charAt(mLevel));
            if(mChildren[index] == null) {
                mChildren[index] = new T9Node(mLevel + 1);
            }
            mChildren[index].insert(value);
        }
    }

    @Override
    public PriorityQueue<String> retrieve(String key) {
        System.out.println("Level: " + mLevel + " key: " + key);
        // Assume key is series of digits, extract value for current level
        if(mLevel == key.length()) {
            return mValues;
        } else {
            int index = Character.getNumericValue(key.charAt(mLevel));
            // TODO Or return matches for this level when no children?
            if(mChildren == null || mChildren[index] == null) return null;
            return mChildren[index].retrieve(key);
        }
    }
}
