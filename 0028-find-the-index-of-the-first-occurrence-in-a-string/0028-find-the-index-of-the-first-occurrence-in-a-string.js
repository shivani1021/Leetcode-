/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
let T = haystack.length; 
let P = needle.length;

if(P===0){
    return 0;
}
 

 for(let i =0; i <=T-P; i++){
    let j =0;

    while (j < P && haystack.charAt(i+j)== needle.charAt(j)){
        j++;
    }

    if(j===P){
        return i;
    }
   
 }
  return -1
    
};