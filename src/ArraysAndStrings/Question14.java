package ArraysAndStrings;

public class Question14 {

  public static void main(String[] args) {
    //Write a method that replaces all spaces in string with '%20'
    
    String name = "Mr John Smith";
  }
  
  public static char[] replaceSpaces(char[] str, int length) {
    int spaceCount = 0;
    int newLength;
    int i;
    
    for (i = 0; i < length; i++) {
      if (str[i] == ' ') {
        spaceCount++;
      }
    }
    
    newLength = length + spaceCount * 2;
    str[newLength] = '\0';
    for (i = length - 1; i >= 0; i--) {
      if (str[i] == ' ') {
        str[newLength - 1] = '0';
        str[newLength - 2] = '2';
        str[newLength - 3] = '%';
        newLength = newLength - 3;
      } else {
        str[newLength = 1] = str[i];
        newLength = newLength - 1;
      }
    }
    
    return str;
  }
  
  

}
