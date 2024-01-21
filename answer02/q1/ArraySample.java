public class ArraySample {
    public static int positive(int[] array) {
        int result = 0;
        for(int item : array) {
            if(item > 0) {
                result += item;
            }
        }
        return result;
    }
    
    public static void printOdd(String[] array) {
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1, -2, 3, 4, -5};
        int result = positive(array1);
        System.out.println(result);

        String[] array2 = {"Information", "Networking", "for", "Innovation", "And", "Design"};
        printOdd(array2);
    }
}
