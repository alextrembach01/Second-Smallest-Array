public class SecondSmallestArray {
    public static void main(String[] args) {

        int[] elements = {40, 25, 10, 5, 6, 4, 25, -2, 2, 11};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < smallest) {
                secondSmallest = smallest;
                smallest = elements[i];
            } else if (elements[i] < secondSmallest) {
                secondSmallest = elements[i];
            }
        }
        System.out.println("Second smallest number in Array is: " + secondSmallest);
    }
}


