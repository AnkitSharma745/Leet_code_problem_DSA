var isPerfectSquare = function(num) {
  let sqrt = Math.sqrt(num)
  if(sqrt==Math.floor(sqrt)){
      return true
  }
  else{
      return false
  }
};

// Math.sqrt(num) calculates the square root of num using the Math.sqrt() method. The result is stored in a variable named sqrt.
// The if statement checks if the square root of num is an integer or not. It does this by comparing the value of sqrt with the largest integer less than or equal to sqrt (which is obtained using the Math.floor() method).
// If the square root of num is an integer (i.e., sqrt is equal to Math.floor(sqrt)), the function returns true, indicating that the input number num is a perfect square.
// Otherwise, the function returns false, indicating that the input number num is not a perfect square.
