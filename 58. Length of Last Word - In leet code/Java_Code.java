public static int lengthOfLastWord(String s) {
    String[] arr = s.trim().split("\\s+");
    int x = arr[arr.length-1].length();
    return x;
}
// Explanation:

// In Java, the public static keywords indicate that this is a public static method that can be called from anywhere in the code.
// The method takes a string s as an input parameter and returns an integer value.
// The trim() method is used to remove any leading and trailing whitespace characters from the string s.
// The split("\\s+") method is used to split the string s into a string array of words using whitespace as a delimiter. The regular expression \\s+ matches one or more whitespace characters.
// The length() method is used to get the length of the last element of the array arr.
// Finally, the length of the last word is returned by the method.