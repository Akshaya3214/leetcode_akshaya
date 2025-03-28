class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        HashSet<Integer> occurance = new HashSet<>();

        for(int num : arr){
            hs.put(num, hs.getOrDefault(num,0)+1);
        }
        for(int freq : hs.values()){
            if(!occurance.add(freq)){
                return false;
            }
        }
        return true;
    }
}