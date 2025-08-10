class Solution {
    public String frequencySort(String s) {
    
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()){
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> maxheap = new PriorityQueue<>(
            (a, b) -> hs.get(b) - hs.get(a)
        );
        maxheap.addAll(hs.keySet());

        StringBuilder sb = new StringBuilder();
        while(!maxheap.isEmpty()){
            char c=maxheap.poll();
            int count = hs.get(c);
            for(int i=0; i<count; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    
    }
}