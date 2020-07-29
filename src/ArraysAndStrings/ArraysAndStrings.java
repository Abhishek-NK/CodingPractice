package ArraysAndStrings;

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
    
  }

}
