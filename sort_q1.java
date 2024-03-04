/*
 * given an integer array arr , move all 0's to the end of it ,ehile maintaning the releative order of the non-zeros element 
 * 
 * note - you must do this in place without making a copy of the array
 * 

 here we use concept of bubble sort
 * 
 */

class sort_q1 {
    static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        // int arr[] = { 4, 4, 0, 43, 0, 3 };
        int arr[] = { 0, 5, 0, 3, 42 };
        sorting(arr);
        print(arr);

    }
}