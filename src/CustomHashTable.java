//import java.util.Arrays;

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
    }
    private static final int DEFAULT_CAPACITY = 10;

    private Entry[] table;
    private int size;

    public CustomHashTable() {
        this.table = new Entry[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private int hash(int key) {
        return (key * 7) % table.length;
    }

    public void insert(int key, String value) {
        if (size >= table.length) {
            System.out.println("Hash table is full, cannot insert more elements.");
            return;
        }

        //TO DO
    }

    public String search(int key) {
        // TO DO
    }

    public void delete(int key) {
        int index = hash(key);
        while (table[index] != null && table[index].getKey() != key) {
            index = (index + 1) % table.length;
        }
        if (table[index] != null && table[index].getKey() == key) {
            table[index] = null; // Mark as deleted
            size--;
        }
    }

    public void printHashTable() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                System.out.println("Index: " + i + ", Key: " + table[i].getKey() + ", Value: " + table[i].getValue());
            } else
            {System.out.println(table[i]);}
        }
    }



    public static void main(String[] args) {
        CustomHashTable hashTable = new CustomHashTable();
        hashTable.insert(5, "a");
        hashTable.insert(15, "b");
        hashTable.insert(25, "c");
        hashTable.insert(35, "d");
        hashTable.insert(45, "e");

        System.out.println("Value for key 25: " + hashTable.search(25)); // Output: Value3

        hashTable.delete(15);
        System.out.println("Value for key 15 after deletion: " + hashTable.search(15)); // Output: null

        hashTable.printHashTable();
    }
}
