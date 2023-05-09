package Part8;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = { 5, 4, 2, 9, 1, 7, 3, 8, 6 };
        Quick.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
