package ArraysAndStrings;

public class Question13 {

  public static void main(String[] args) {
    //Given two strings, write a method to decide if one is a permutation of the other.
    
    String dog = "dog";
    String god = "god";
    String pod = "pod";
    
    //Answer 1: Sort strings then compare with .equals()
    System.out.println("1: Is '" + dog + "' a permutation of '" + god + "': " + isAnagram(dog, god));
    System.out.println("1: Is '" + pod + "' a permutation of '" + god + "': " + isAnagram(pod, god));
    
    //Answer 2: Check if two string have identical character count
    System.out.println("\n2: Is '" + dog + "' a permutation of '" + god + "': " + isAnagram2(dog, god));
    System.out.println("2: Is '" + dog + "' a permutation of '" + pod + "': " + isAnagram2(dog, pod));
    
    
  }
  
  public static boolean isAnagram(String first, String second) {
    if (first.length() != second.length()) {
      return false;
    }
    return sort(first).contentEquals(sort(second));
  }
  
  public static String sort(String unsorted) {
    char[] content = unsorted.toCharArray();
    java.util.Arrays.sort(content);
    return new String(content);
  }
  
  public static boolean isAnagram2(String first, String second) {
    if (first.length() != second.length()) {
      return false;
    }
    
    int[] letters = new int[256];
    char[] first_array = first.toCharArray();
    
    for (char c : first_array) {
      //chars can be used as index
      letters[c]++;
    }
    
    for (int i = 0; i < second.length(); i++) {
      int c = (int) second.charAt(i);
      if (--letters[c] < 0) {
        return false;
      }
    }
    
    return true;
  }

}
