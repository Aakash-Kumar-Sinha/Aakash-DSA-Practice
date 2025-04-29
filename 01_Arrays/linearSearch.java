public class linearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,8,9,3,5,7,1,6};
        int key = 8;
        int result = linearSearch(numbers, key);

        if (result == -1) {
            System.out.println("Index not found...");
        } else {
            System.out.println("Index at key value: " + result);
        }
    }
}