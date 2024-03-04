import java.util.Scanner;

/**
 * bubbleSort
 */
public class bubbleSort {

    static void bubble(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // any swap happen
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

                /*
                 * if after som iteratin we found that rest of element are already sorted then
                 * it stops the loop for further swaping
                 * 
                 */
                if (flag != false) {
                    return;

                }

            }

        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element:");
            arr[i] = sc.nextInt();

        }
        printArray(arr);
        bubble(arr);
        System.out.println("After sorting:");
        printArray(arr);
        sc.close();

    }

}