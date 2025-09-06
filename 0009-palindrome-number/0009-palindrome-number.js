/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x<0 || x%10==0 && x!=0){
        return false;
    }

    let orignalNO = x;
    let ReversedNo= 0;

    while(x>0){
        let digit= x%10; // extract the last digit
        ReversedNo = ReversedNo * 10 + digit;
        x = Math.floor(x/10);
    }
    return ReversedNo == orignalNO;
}