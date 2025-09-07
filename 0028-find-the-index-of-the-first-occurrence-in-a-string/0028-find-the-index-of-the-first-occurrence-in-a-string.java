class Solution {
    public int strStr(String haystack, String needle) {
        int hlen=haystack.length();
        int nlen=needle.length();

        for (int i =0; i<=hlen-nlen; i++){
            int j=0;

            while (j< nlen && haystack.charAt(i+j)== needle.charAt(j)){
                j++;
            }
            if(j==nlen){
                return i;
            }
        }
        return -1;
    }

}