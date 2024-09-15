import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        // Initializing array 'a' with values
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array a: " + Arrays.toString(a));

        // Initializing array 'b' with a size of 4
        float b[] = new float[6];
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        b[3] = 40;

        System.out.println("Array b: " + Arrays.toString(b));
    }
}
