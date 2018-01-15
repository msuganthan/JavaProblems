package array;

public class ArrayRemoveDuplicates {
  public static void main(String[] args) {
    new ArrayRemoveDuplicates().removeDuplicates(new int[]{1, 2, 2, 3, 4, 5, 5, 6});
  }

  public void removeDuplicates(int[] arrayWithDuplicates) {
    int len = arrayWithDuplicates.length;
    int[] result = new int[len];
    for (int i = 0, j=0; i < len-1; i++) {
      if(arrayWithDuplicates[i] != arrayWithDuplicates[i+1]) {
        result[j] = arrayWithDuplicates[i];
        j++;
      }
    }
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
