public class secondLargest {
    public static int secondlargest(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {
                secondlargest = largest;
                largest = numbers[i];
            }  else if (numbers[i] > secondlargest && numbers[i] != largest) {
                secondlargest = numbers[i];
        }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int numbers[] = {2,1,4,19,3,6,7,18,0,5};

        System.out.println("secondlargest: " + secondlargest(numbers));
    }
}