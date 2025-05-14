class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return res;
        }
        Map<Character, String> DigToLet =new HashMap<>();
        DigToLet.put('2', "abc");
        DigToLet.put('3', "def");
        DigToLet.put('4', "ghi");
        DigToLet.put('5', "jkl");
        DigToLet.put('6', "mno");
        DigToLet.put('7', "pqrs");
        DigToLet.put('8', "tuv");
        DigToLet.put('9', "wxyz");

        combinations(digits, 0, new StringBuilder(), res, DigToLet);

        return res;
    }
    private void combinations(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> DigToLet){
        if(idx==digits.length()){
            res.add(comb.toString());
            return;
        }
        String letters=DigToLet.get(digits.charAt(idx));
        for(char l: letters.toCharArray()){
            comb.append(l);
            combinations(digits, idx+1, comb, res, DigToLet);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}