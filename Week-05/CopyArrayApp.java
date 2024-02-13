import java.util.ArrayList;

public class CopyArrayApp {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 3, 4}; // array with duplicate elements

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for (int num : numbers) {
            list1.add(num); // adding elements from array to list
        }

        //list1 before removing duplicates
        System.out.println("List1 before removing duplicates: " + list1);

        //list1 after removing duplicates
        list1 = removeDuplicates(list1); // removing duplicates
        System.out.println("List1 after removing duplicates: " + list1);


    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> originalList) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int num : originalList) {
            if (!newList.contains(num)) {
                newList.add(num);
            }
        }

        return newList;
    }
}
