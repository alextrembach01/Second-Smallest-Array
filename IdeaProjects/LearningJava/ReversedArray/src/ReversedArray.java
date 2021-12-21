public class ReversedArray {
    public static void main (String[] args) {

        int[] array = {1,4,7,10,11,18,26,31,38,44};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
