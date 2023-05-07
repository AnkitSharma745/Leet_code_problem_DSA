def lengthOfLastWord(s):
    arr = s.strip().split()
    x = len(arr[-1])
    return x
# Explanation:

# In Python, def keyword is used to define a function.
# The strip() method is used to remove any leading and trailing whitespace characters from the string s.
# The split() method is used to split the string s into a list of words using the whitespace character as a delimiter. If no delimiter is specified, whitespace is used by default.
# The len() function is used to get the length of the last element of the list arr.
# Finally, the length of the last word is returned by the function.