public class ArrayDuplicates {
    public static void main (String[] args) {

        int[] array = {1,1,3,4,5,1,6};

        for (int i = 0; i < array.length; i++)
        {
        for (int j = i; j < array.length; j++)
        {
            if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+array[i]);
                }
            }
        }
    }
}
