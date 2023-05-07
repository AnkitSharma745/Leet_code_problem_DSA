def isPerfectSquare(num):
    sqrt = int(num ** 0.5)
    if sqrt**2 == num:
        return True
    else:
        return False

# In Python, def keyword is used to define a function.
# The function isPerfectSquare() takes a single parameter num.
# The ** operator in Python is used for exponentiation. num ** 0.5 calculates the square root of num and returns a float value.
# The int() function is used to convert the square root of num to an integer value, which is stored in the variable sqrt.
# The if statement checks if the square of sqrt is equal to num.
# If the square of sqrt is equal to num, the function returns True, indicating that the input number num is a perfect square.
# Otherwise, the function returns False, indicating that the input number num is not a perfect square.