package ArraysAndStrings;

public class Question12 {

  public static void main(String[] args) {
    //Implement a function void reverse which reverses a null terminated string.
    
    String helloworld = "Hello World";
    
    String reversed = reverse(helloworld);
    System.out.println(reversed);
  }
  
  public static String reverse(String str) {
    char[] in = str.toCharArray();
    int begin = 0;
    int end = in.length - 1;
    char temp;
    
    while (end > begin) {
      temp = in[begin];
      in[begin] = in[end];
      in[end] = temp;
      end--;
      begin++;
    }
    
    return new String(in);
  }

}
