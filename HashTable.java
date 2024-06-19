package org.example;
import java.util.*;

public class HashTable {
    private int tableSize;
    private ArrayList<String>[] table;
    private int count;

    public HashTable(int size) {
        this.tableSize = size;
        this.table = new ArrayList[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = new ArrayList<>();
        }
        this.count = 0;
    }

    public HashTable() {
        this(10);
    }

    private int hash(String key) {
        int hashValue = 0;
        for (char ch : key.toCharArray()) {
            hashValue = (hashValue * 31 + ch) % tableSize;
        }
        return hashValue;
    }

    public void add(String ch) {
        String[] parts = ch.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid input");
            return;
        }
        String key = parts[1];
        int index = hash(key);
        if (table[index].contains(key)) {
            System.out.println("Already added");
        } else {
            table[index].add(key);
            count++;
            System.out.println("Added");
        }
    }

    public void remove(String ch) {
        String[] parts = ch.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid input");
            return;
        }
        String key = parts[1];
        int index = hash(key);
        if (table[index].remove(key)) {
            count--;
            System.out.println("Removed");
        } else {
            System.out.println(key + " not found");
        }
    }

    public int getSize() {
        return count;
    }

    public boolean contains(String ch) {
        String[] parts = ch.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid input");
            return false;
        }
        String key = parts[1];
        int index = hash(key);
        if (table[index].contains(key)) {
            System.out.println(key + " found");
            return true;
        } else {
            System.out.println(key + " not found");
            return false;
        }
    }

    public void display() {
        for (int i = 0; i < tableSize; i++) {
            System.out.println(i + ".- " + table[i]);
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">");
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            if (command.equals("add")) {
                hashTable.add(input);
            } else if (command.equals("remove")) {
                hashTable.remove(input);
            } else if (command.equals("size")) {
                System.out.println(hashTable.getSize());
            } else if (command.equals("contains")) {
                hashTable.contains(input);
            } else if (command.equals("display")) {
                hashTable.display();
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command");
            }
        }
    }
}
