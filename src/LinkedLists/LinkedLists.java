package LinkedLists;

import java.util.*;

/**
 * @author Abhishek
 * 
 * Linked lists:
 * Allows for dynamic memory allocation.
 * No need for contiguous memory locations.
 * Adding and deleting elements are not expensive.
 * Acts like a queue, FIFO.
 * Access: O(n)
 * Manipulation: O(1)
 * 
 */
public class LinkedLists {
	
  /**
   * The main method.
   * 
   * @param args the arguments for the main method.
   */
  public static void main(String[] args) {

    LinkedList<String> list = new LinkedList<String>();

    //Adding elements
    list.add("Steve");
    list.add("Abhishek");
    list.add("Romario");
    list.add("Obama");

    //Adding element to first position
    list.addFirst("Antoine");

    //Adding element to last position
    list.addLast("Ayesha");

    //Adding element to the fourth position (starts from 0)
    list.add(3, "Beyonce");
    
    //Iterate through linked list
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    //Remove third element (index starts at 0)
    list.remove(2);
  }
}
