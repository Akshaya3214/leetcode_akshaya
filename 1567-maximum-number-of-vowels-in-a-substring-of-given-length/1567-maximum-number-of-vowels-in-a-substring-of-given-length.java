class Solution {
    public int maxVowels(String s, int k) {
        int n= s.length();
        String vowels = "aeiou";
        int maxVowelCount = 0, currVowelCount = 0;

        for(int i=0; i<k; i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                currVowelCount++;
            }
        }
        maxVowelCount=currVowelCount;

        for(int i=k; i<n; i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                currVowelCount++;
            }
            if(vowels.indexOf(s.charAt(i-k)) != -1){
                currVowelCount--;
            }
            maxVowelCount = Math.max(maxVowelCount, currVowelCount);
        }
        return maxVowelCount;
    }
}