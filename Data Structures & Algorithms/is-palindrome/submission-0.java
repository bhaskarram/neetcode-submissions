class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();    
        int n = ss.length();
        int i = 0, j =n-1;
        while(i<j){
            if(ss.charAt(i)!=ss.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
