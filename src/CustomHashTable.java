// import java.util.Arrays;

public class CustomHashTable {

    public static class Entry {
        private final int key;
        private final Response value;

        public Entry(int key, Response value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public Response getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }

    private static final int DEFAULT_CAPACITY = 100;
    private Entry[] table;
    private int size;

    public CustomHashTable() {
        this.table = new Entry[DEFAULT_CAPACITY];
        this.size = 0;
    }


    private int hash(int key) {
        return (key * 7) % table.length;
    }

    public void insert(int key, Response value) {
        if (size >= table.length / 2
        ) {
            rehash();
        }

        int index = hash(key);
        while (table[index] != null && table[index].getKey() != key) {
            index = (index + 1) % table.length;
        }

        table[index] = new Entry(key, value);
        size++;
    }

    public Response search(int key) {
        int index = hash(key);
        int originalIndex = index;

        while (table[index] != null) {
            if (table[index].getKey() == key) {
                return table[index].getValue();
            }

            index = (index + 1) % table.length;

            // Stop if we've looped all the way around
            if (index == originalIndex) {
                break;
            }
        }

        return null;
    }

    public void delete(int key) {
        int index = hash(key);
        while (table[index] != null && table[index].getKey() != key) {
            index = (index + 1) % table.length;
        }
        if (table[index] != null && table[index].getKey() == key) {
            table[index] = null; // Mark as deleted
            size--;

            // Rehash following entries to avoid broken chains
            index = (index + 1) % table.length;
            while (table[index] != null) {
                Entry entryToRehash = table[index];
                table[index] = null;
                size--;
                insert(entryToRehash.getKey(), entryToRehash.getValue());
                index = (index + 1) % table.length;
            }
        }
    }

    public void printHashTable() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                System.out.println("Index: " + i + ", Key: " + table[i].getKey() + ", Value: " + table[i].getValue());
            } else {
                System.out.println("Index: " + i + ", Empty");
            }
        }
    }

    public void rehash() {
        Entry[] oldTable = table;
        table = new Entry[oldTable.length * 3];
        size = 0;

        for (Entry entry : oldTable) {
            if (entry != null) {
                insert(entry.getKey(), entry.getValue());
            }
        }
    }

    public int size() {
        return size;
    }

    public Entry[] getTable() {
        return table;
    }

}