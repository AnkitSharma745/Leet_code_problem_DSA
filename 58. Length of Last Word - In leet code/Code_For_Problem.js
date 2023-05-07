var lengthOfLastWord = function(s) {
  let arr= s.trim().split(" ")
  let x = arr[arr.length-1].length;
  return x
};