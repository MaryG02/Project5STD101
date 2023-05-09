package Part2;


public class Main {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 7, 0, 3, 9};
        Selection.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
