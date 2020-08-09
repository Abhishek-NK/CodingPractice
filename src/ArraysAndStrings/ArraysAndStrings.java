package ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraysAndStrings {

  public static void main(String[] args) {
    
    //Initialise array
    String[] cars = {"Volvo", "BMW", "Ford", "Lambo", "Ferrari", "Mazda"};
    int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    
    //Access element
    System.out.println(cars[1]);
    
    //change element at specified index
    numbers[0] = 7;
    
    //iterate through array
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Element " + i + ": " + numbers[i]);
    }
    
    //loop through elements
    for (String i : cars) {
      System.out.println("Car: " + i);
    }
    
    //Multidimensional array
    int[][] multi = { {1, 2, 3, 4}, {5, 6, 7, 8} };
    System.out.println("\nMulti: " + multi[0][3]); 
  
    //create hashmap
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    
    //Add keys and values(Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Japan", "Tokyo");
    capitalCities.put("India", "Delhi");
    capitalCities.put("India", "Goa");
    System.out.println(capitalCities);
    System.out.println(capitalCities.get("India"));
    
    //loop through HashMap
    for (String i : capitalCities.keySet()) {
      System.out.println("City: " + i);
    }
    
    //ArrayList
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Duck");
    animals.add("Elephant");
    animals.add("Lion");
    System.out.println(animals);
    
    //Without StringBuffer the time is O(n^2) because String in java is internally an array
    StringBuffer sentence = new StringBuffer();
    for (String w : cars) {
      sentence.append(w);
    }
    System.out.println("String buffer: " + sentence.toString());
    
  }
  

}
