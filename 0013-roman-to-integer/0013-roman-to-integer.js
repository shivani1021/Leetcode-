/**
 * @param {string} s
 * @return {number}
 */

 var getValue = function(ch){
    switch (ch){
        case 'I' : return 1;
        case 'V' : return 5;
        case 'X' : return 10;
        case 'L' : return 50;
        case 'C' : return 100;
        case 'D' : return 500;
        case 'M' : return 1000;
    }
 }
var romanToInt = function(s) {

    let total = 0;

    for(let i = 0 ; i<s.length; i++){
        let current = getValue(s.charAt(i));

        if(i+1 < s.length){
            let next = getValue(s.charAt(i+1));


            if(current < next){
                total -= current;
                continue;
            }

        }
        total += current;
    }
return total;
    
};