package Part6;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = { 9, 0, 8, 3, 7, 1, 4 };
        Merge.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }    }
}
