public class largestArray {
    public static int largest(int numbers[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {2,1,4,19,3,6,7,18,0,5};

        System.out.println("largest: " + largest(numbers));
    }
}