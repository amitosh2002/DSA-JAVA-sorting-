public class selection {

    static void seletionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minIndx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndx]) {

                    minIndx = j;

                }

            }
            // arr[i] = arr[i] ^ arr[minIndx];
            // arr[minIndx] = arr[i] ^ arr[minIndx];
            // arr[i] = arr[i] ^ arr[minIndx];
            if (minIndx != i) {

                int temp = arr[i];
                arr[i] = arr[minIndx];
                arr[minIndx] = temp;
            }

        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 5, 2, 1 };
        print(arr);
        seletionSort(arr);
        print(arr);

    }
}
