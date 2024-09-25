package linear_search;

public class FindElement {
    public static void main(String[] args) {
        // Given an array, and an element check if the element exists in the array or not.

        int[] arr = new int[]{1,3,4,5,6,8,43,634,734,23,643,56,754};
        System.out.println(checkElement(arr, 3));
        System.out.println(checkElement(arr, 7));
        System.out.println(checkElement(arr, 100));
        System.out.println(checkElement(arr, 23));
    }

    static boolean checkElement(int[] arr, int element) {
        for(int num : arr) {
            if(num == element) return true;
        }

        return false;
    }
}
