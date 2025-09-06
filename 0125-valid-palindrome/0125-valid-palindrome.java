

class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();

        int left = 0; 
        int right = s.length()-1;

        while(left < right){
            //skip the non-alphanumeric from left
            while(left < right &&  !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
             // skip the non-alphanumeric from right       
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            //compare character 

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;

    }
}