/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
  const cleanedS = s.toLowerCase().replace(/[^a-z0-9]/g, '');

    let left =0;
    let right =cleanedS.length-1;

    while(left < right){

        if(cleanedS.charAt(left) !== cleanedS.charAt(right)){
            return false;
        }
        left++;
        right--;

    }
    return true;
    
};