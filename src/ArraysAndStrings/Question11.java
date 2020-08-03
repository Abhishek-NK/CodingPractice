package ArraysAndStrings;

public class Question11 {

  public static void main(String[] args) {
    //Implement an algorithm to determine if a string has all unique characters.
    //What if you cannot use addition data structures.
    
    String unique = "abc";
    String repeated = "abca";
    
    System.out.println(check(unique));
    System.out.println(check(repeated));
    
    //Alternative:
    // 1) Compare every character of string to every other character of string. O(n^2)
    // 2) Sort String first by letter then check for identical letters. O(n log n)
  }
  
  public static boolean check(String string) {
    //Can't be more than 256 ASCII characters.
    if (string.length() > 256) {
      return false;
    }
    
    //Use boolean array to flag if a character has been used.
    boolean[] char_set = new boolean[256];
    
    for (int i = 0; i < string.length(); i++) {
      int val = string.charAt(i);
      if (char_set[val]) {
        return false;
      }
      char_set[val] = true;
    }
    
    return true;
  }

}
