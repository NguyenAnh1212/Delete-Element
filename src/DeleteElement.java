import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int [] N = {1,2,3,5,6};
        System.out.printf("%-20s%s","Print N: ", "");
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] +"\t");
        }
       deleteElement(N,2);

    }
    public static int[] deleteElement(int [] array, int index){
        Scanner scanner = new Scanner(System.in);
        int[] newArray;
        newArray = new int[array.length-1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < array.length -1 ; i++) {
            newArray[i] = array[i+1];
        }
        array = newArray;
        System.out.printf("\n" + "%-20s%s","Print array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +"\t");
        }
        return newArray;
    }
}
