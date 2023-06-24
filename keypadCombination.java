class Solution {
    String [] arr = new String[]{"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length() == 0) return list;
        StringBuilder sb = new StringBuilder();
        backtrack(list,digits,sb,0);
        return list;
    }
    private void backtrack(List<String> list,String str,StringBuilder sb,int index){
        if(sb.length() == str.length()){
            list.add(sb.toString());
            return;
        }
        else{
            int val = str.charAt(index)-'0';
            for(int i=0;i<arr[val-1].length();i++){
                sb.append(arr[val-1].charAt(i));
                backtrack(list,str,sb,index+1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
