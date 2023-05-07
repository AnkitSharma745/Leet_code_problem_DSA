public static boolean isPerfectSquare(int num) {
    int sqrt = (int) Math.sqrt(num);
    if (sqrt * sqrt == num) {
        return true;
    } else {
        return false;
    }
}
// In Java, the public static keywords indicate that this is a public static method that can be called from anywhere in the code.
// The method takes a single integer parameter num and returns a boolean value.
// Math.sqrt(num) calculates the square root of num using the Math.sqrt() method. The result is cast to an integer using the (int) operator and stored in a variable named sqrt.
// The if statement checks if the square of sqrt is equal to num.
// If the square of sqrt is equal to num, the method returns true, indicating that the input number num is a perfect square.
// Otherwise, the method returns false, indicating that the input number num is not a perfect square.

