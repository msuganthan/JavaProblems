package array;

public class ArrayLimitation {

  int[] originalArray = {1, 2, 3, 4, 5};
  public void extendArray(int length) {
    int[] newArray = new int[length];
    for (int i = 0; i < originalArray.length; i++) {
      newArray[i] = originalArray[i];
    }
    originalArray = newArray;
  }

  public void extendArrayUsingArrayCopy(int length) {
    int[] newArray = new int[length];
    System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);
    originalArray = newArray;
  }

  public void printIntArray() {
    for (int i = 0; i < originalArray.length; i++) {
      System.out.println(originalArray[i]);
    }
  }

  public static void main(String[] args) {
    ArrayLimitation arrayLimitation = new ArrayLimitation();
    arrayLimitation.printIntArray();
    //System.out.println("==========Extend Array ==========");
    //arrayLimitation.extendArray(10);
    //arrayLimitation.printIntArray();
    System.out.println("==========Extend Array ==========");
    arrayLimitation.extendArray(15);
    arrayLimitation.printIntArray();
  }
}
