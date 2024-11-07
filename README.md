
# HashTable Implementation in Java

## Overview

This project implements a simple hash table data structure in Java using an array of `ArrayList` objects. The `HashTable` class provides methods for adding, removing, checking if an element exists, and displaying the contents of the hash table. It also supports basic operations like getting the size of the table.

The hash table uses a custom hash function to map string keys to index values in the array, and handles collisions using separate chaining (i.e., each table index is an `ArrayList`).

## Features

- **Add elements**: Adds a string element to the hash table.
- **Remove elements**: Removes a string element from the hash table.
- **Contains**: Checks if a string element exists in the hash table.
- **Display**: Displays the entire hash table, showing the contents of each bucket.
- **Size**: Returns the number of elements in the hash table.

## Commands

The program runs in a loop, accepting commands from the user input:

- `add <element>`: Adds an element to the hash table.
- `remove <element>`: Removes an element from the hash table.
- `contains <element>`: Checks if an element is present in the hash table.
- `size`: Displays the current size (number of elements) in the hash table.
- `display`: Displays the contents of the entire hash table.
- `exit`: Exits the program.

## Example Usage

![Screenshot_20241107_090713](https://github.com/user-attachments/assets/2171a440-7f40-48e3-a667-afb259267e2e)


```bash
> add hello
Added

> add world
Added

> contains hello
hello found

> remove hello
Removed

> size
1

> display
0.- [world]
```

## Code Explanation

### Class: `HashTable`

- **Attributes**:
  - `tableSize`: The number of buckets in the hash table.
  - `table`: An array of `ArrayList<String>` that stores elements.
  - `count`: The number of elements currently in the table.

- **Methods**:
  - `add(String ch)`: Adds an element to the hash table.
  - `remove(String ch)`: Removes an element from the hash table.
  - `contains(String ch)`: Checks if an element is in the hash table.
  - `getSize()`: Returns the current number of elements in the hash table.
  - `display()`: Displays all elements in the hash table.
  - `hash(String key)`: A private method that generates a hash code for the input string key.

### Main Class

The main method allows interaction with the hash table through the command line, accepting user input and performing the relevant operation based on the command entered.

## Installation

1. Clone the repository to your local machine:

   ```bash
   git clone git@github.com:Ameur-bellil/Implementation-HashTable-Python-Java.git
   ```
   or
   
   ```bash
   git clone https://github.com/Ameur-bellil/Implementation-HashTable-Python-Java.git
   ```
   

3. Navigate to the project directory:

   ```bash
   cd hashtable-project
   ```

4. Compile the Java file:

   ```bash
   javac HashTable.java
   ```

5. Run the program:

   ```bash
   java HashTable
   ```

## Requirements

- JDK 8 or higher
- A terminal or command prompt to interact with the program

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
