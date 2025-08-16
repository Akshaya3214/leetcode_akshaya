class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character, Integer> s1count = new HashMap<>();
        HashMap<Character, Integer> s2count = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            s1count.put(s1.charAt(i), s1count.getOrDefault(s1.charAt(i), 0)+1);
            s2count.put(s2.charAt(i), s2count.getOrDefault(s2.charAt(i), 0)+1);
        }
        if(s1count.equals(s2count)){
            return true;
        }
        int left=0;
        for(int right=s1.length(); right<s2.length(); right++){
            char charright=s2.charAt(right);
            s2count.put(charright, s2count.getOrDefault(charright, 0)+1);

            char charleft=s2.charAt(left);
            s2count.put(charleft, s2count.get(charleft)-1);
            if(s2count.get(charleft)==0){
                s2count.remove(charleft);
            }
            left++;
            if(s1count.equals(s2count)){
                return true;
            }
        }
        
        return false;
    }
}