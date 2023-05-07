import math

def mySqrt(x):
    sqt = math.sqrt(x)
    return math.floor(sqt)

# In Python, the import keyword is used to import the math module which provides various mathematical functions.
# The function mySqrt() takes a single parameter x.
# math.sqrt(x) calculates the square root of x using the math.sqrt() function. The result is stored in a variable named sqt.
# math.floor(sqt) rounds down the square root value sqt to the nearest integer value that is less than or equal to sqt.
# The function returns the rounded-down integer value of the square root of x.