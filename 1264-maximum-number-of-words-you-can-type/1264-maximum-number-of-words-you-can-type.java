class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int result = 0;
       

        for(String word: words){
            boolean canType = true;
            for(int i =0 ; i < brokenLetters.length (); i++){
               char broken= brokenLetters.charAt(i);
               if(word.indexOf(broken)!=-1){
                canType = false;
                break;
               }
            }
            if(canType){
                result++;
            }
        }
        return result;
    }
}