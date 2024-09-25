package linear_search;

import java.util.Objects;

public class SearchInString {
    public static void main(String[] args) {
        String[] names = new String[]{"Gaurav", "Ajay", "Suraj", "Saurav"};
        System.out.println(checkElement(names, "Gaurav"));
        System.out.println(checkElement(names, "gaurav"));
    }
    static boolean checkElement(String[] arr, String element) {
        for(String num : arr) {
            if(Objects.equals(num, element)) return true;
        }

        return false;
    }
}
