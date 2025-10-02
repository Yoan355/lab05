TechSupport - the DodgySoft Technical support system.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.

This project aims to implements a technical support system for customers of 
the DodgySoft software company. Users can describe their software problems and 
get advice instantly!

The idea is based on Eliza - a famous program described by Joseph Weizenbaum 
in 1966. (Do a web search for "Eliza" and "Weizenbaum" if you want to know 
more about this.)

In fact, it is much more primitive than Eliza. But that's enough to match the 
quality of many software companies' technical support advice...  ;-)

To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

The purpose of this project is to demonstrate and study library classes, such 
as ArrayList, HashMap, HashSet, and Random.

This project is only a first, rudimentary step towards the full solution.


////////////////////AWNSERS TO QUESTIONS/////////////////////

24: A HashMap is a data structure that stores information in key-value pairs.It stores data
using a key and value.It helps us find the values much faster with the key.

25: A Key-related methods (K):
 get(Object key)
 remove(Object key)
 containsKey(Object key)
 keySet()
 put(K key, V value)


Value-related methods (V):
 containsValue(Object value)
values()
replace(K key, V value)
Yes, you can use the same type for both key and value.


26:  size() returns the number of key-value mappings in this map.


28: When you add an entry to a map with a key that already exists, 
the new value replaces the old value associated with that key.


29: When you add an entry to a map with two different keys, both entries are stored separately. 
Each key maps to its own value, and the map increases in size.



30:  if (phoneBook.containsKey("String")) {
            System.out.println(".... is in the phone book.");
        } else {
            System.out.println(".... is not in the phone book.");
        }

        
31: When you try to look up a value and the key does not exist in the map,it shows me "null"
meaning that the key does not exist.



32: According to the Java Documentation Library,
you can print all the keys in a map using the .keySet() method, which returns a Set of all keys.


34: Both HashSet and ArrayList store objects, allow nulls,
 and support basic operations like add, remove, and iterate.

 
 35: HashSet returns unique words in no set order.
 ArrayList returns all words, including duplicates, 
 in the order they were added.

 
 36: If there are extra spaces between words,
 the problem is that Java might treat them as 
 empty strings when splitting. 

 
 
 37:
 
