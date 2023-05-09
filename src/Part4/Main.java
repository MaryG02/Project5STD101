package Part4;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = { 13, 75, 12, 4, 18, 6, 9, 10, 7, 14, 15 };
        Insertion.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
