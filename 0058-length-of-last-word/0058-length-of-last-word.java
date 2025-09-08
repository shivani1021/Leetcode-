class Solution {
    public int lengthOfLastWord(String s) {
          s=s.trim();
          int lastspaceIndex= s.lastIndexOf(' ');

return s.length() - lastspaceIndex- 1;
    } 
}