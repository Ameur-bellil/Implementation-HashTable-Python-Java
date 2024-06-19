class HashTable:
    def __init__(self, size=10):
        self.table_size = size  
        self.table = [[] for _ in range(self.table_size)]
        self.count = 0

    def hash(self, key):
        hash_value = 0
        for char in key:
            hash_value = (hash_value * 31 + ord(char)) % self.table_size
        return hash_value

    def add(self , ch):
        key = ch.split()[-1]
        index = self.hash(key)
        if key in self.table[index]:
            print(f"already added")
        elif len(ch.split()) >2:
            print("Invalid input")    
        else:
            self.table[index].append(key)
            self.count += 1 
            print("added ")

    def remove(self , ch):
        ch.split()[-1]
        index = self.hash(ch.split()[-1])
        try:    
            if len(ch.split())<2:
                print("Invalid input")
            else:    
                self.table[index].remove(ch.split()[-1])
                self.count -= 1
                print("removed ")
        except ValueError:
            print(f"{ ch.split()[-1]} not found")

    def get_size(self):  
        return self.count

   
    def contains(self, ch):
        key = ch.split()[-1]
        index = self.hash(key)
        if key in self.table[index]:
            print(f"{key} found")
            return True
        else:
            print(f"{key} not found")
            return False

    def display(self):
        for i in range(self.table_size):
            print(f"{i}.- {self.table[i]}")


hash_table = HashTable()

while True:
    ch = input(">").split()
    if ch[0]=="add":
        hash_table.add(ch[-1])
    elif ch[0]=="remove":
        hash_table.remove(ch[-1])
    elif ch[0]=="contains":
        hash_table.contains(ch[-1])
    elif ch[0]=="size":
        print(f"{hash_table.get_size()}")
    elif ch[0]=="display":
        hash_table.display()
    elif ch[0] == "exit":
        break
    else:
        print("Invalid operation")

 

 
