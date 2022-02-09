import java.util.Scanner;

public class DeleteElement1 {
    public static void main(String[] args) {
        int [] N = {1,2,3,5,6};
//        System.out.printf("%-20s%s","Print N: ", "");
//        for (int i = 0; i < N.length; i++) {
//            System.out.print(N[i] +"\t");
//        }
        DeleteE(N,6);
    }
    public static int[] DeleteE(int[] arr, int Elt){
        int index = -1;
        boolean Find = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == Elt){
                index = i;
                Find = true;
            }
        }
        if (!Find){
            System.out.printf("\n" + "Not found %d in the list",Elt);
        }
        if(index != -1){
            int[] newArray;
            newArray = new int[arr.length-1];
            for (int i = 0; i < index; i++) {
                newArray[i] = arr[i];
            }
            for (int i = index; i < arr.length -1 ; i++) {
                newArray[i] = arr[i+1];
            }
            arr = newArray;
            System.out.printf("\n" + "%-20s%s","Print array: ", "");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] +"\t");
            }
        }   return arr;
    }
}

