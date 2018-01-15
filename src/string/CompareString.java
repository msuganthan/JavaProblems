package string;

public class CompareString {
  public static void main(String[] args) {
    String first = "Suganthan";
    String second = "Suganthan";
    System.out.println(compareString(first, second));
  }

  private static boolean compareString(String first, String second) {
    int n = first.toCharArray().length;
    if(n==second.toCharArray().length) {
      char[] v1 = first.toCharArray();
      char[] v2 = second.toCharArray();
      int i = 0;
      while(n-- != 0) {
        if(v1[i]!=v2[i])
          return false;
        i++;
      }
      return true;
    }
    return false;
  }
}
