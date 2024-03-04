/*
 * given an array of names of fruits you have to sort it in lexicographical order using selection sort
 * 
 * 
 * lexicographical mean in alphabatic order -- -like apple come first then banana
 */

class sort_q2 {

    static void sortFruits(String[] fruits) {

        for (int i = 0; i < fruits.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < fruits.length; j++) {

                if (fruits[j].compareTo(fruits[min_index]) < 0) {

                    min_index = j;

                }

                String temp = fruits[i];
                fruits[i] = fruits[min_index];
                fruits[min_index] = temp;

            }

        }
    }

    static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {

        String fruits[] = { "lime", "kiwi", "papaya", "banana", "watermellon", "apple" };

        System.out.println("Before sorting");
        printArray(fruits);
        System.out.println("After sorting");
        sortFruits(fruits);
        printArray(fruits);

    }
}