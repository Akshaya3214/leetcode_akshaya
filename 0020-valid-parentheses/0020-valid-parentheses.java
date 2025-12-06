class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hs = new HashMap<>();
        hs.put(')', '(');
        hs.put(']', '[');
        hs.put('}', '{');

        for(char c:s.toCharArray()){
            if(hs.containsValue(c)){
                stack.push(c);
            }else if(hs.containsKey(c)){
                if(stack.isEmpty() || hs.get(c)!=stack.pop()){
                    return false;
                }
                
            }
        }
        return stack.isEmpty();
    }
}