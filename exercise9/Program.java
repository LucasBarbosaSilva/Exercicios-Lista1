package exercise9;

public class Program {
    public static void main(String[] args) {
      int[] array1 = {4,5,3,2,7,5,3,2,6,4,3};
      int[] array2 = { 7, 6, 5, 5, 4, 4, 3, 3, 3, 2, 2};
      MergeSort merge = new MergeSort(array1);
      QuickSort quick = new QuickSort(array1);
      System.out.println(merge.sort());
      System.out.println(quick.sort());
      merge = new MergeSort(array2);
      quick = new QuickSort(array2);
      System.out.println(merge.sort());
      System.out.println(quick.sort());
    }
}
