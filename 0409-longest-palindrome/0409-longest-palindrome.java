class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        int ocount=0;
        for(char c:s.toCharArray()){
            hs.put(c, hs.getOrDefault(c, 0)+1);
            if(hs.get(c)%2==1){
                ocount += 1;
            }else{
                ocount -= 1;
            }
        }
        if(ocount>1){
            return s.length()-ocount+1;
        }else{
            return s.length();
        }
        
    }
}