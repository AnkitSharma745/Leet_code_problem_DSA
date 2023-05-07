import java.lang.Math;

public static int mySqrt(int x) {
    double sqt = Math.sqrt(x);
    return (int) Math.floor(sqt);
}

// In Java, the import keyword is used to import the Math class which provides various mathematical functions.
// The method mySqrt() takes a single integer parameter x and returns an integer value.
// Math.sqrt(x) calculates the square root of x using the Math.sqrt() method. The result is stored in a variable named sqt.
// Math.floor(sqt) rounds down the square root value sqt to the nearest integer value that is less than or equal to sqt.
// The result of Math.floor(sqt) is cast to an integer using the (int) operator and returned as the integer square root of x.