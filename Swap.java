public class Swap{
    public static void main(String[] args) {
        // Two numbers to swap
        int num1 = 5;
        int num2 = 10;

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Using a temporary variable to swap
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
	}
}
