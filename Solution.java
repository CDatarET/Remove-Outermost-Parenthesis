class Solution {
    public String removeOuterParentheses(String s) {
        int stack = -1;
        int[] pairs = new int[s.length()];
        int r = -1;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(stack == -1) pairs[++r] = i;
                stack++;
            }
            else stack--;

            if(stack == -1) pairs[++r] = i;
        }

        StringBuilder sb = new StringBuilder("");
        int trav = 0;
        for(int i = 0; i < s.length(); i++){
            if(i == pairs[trav]){
                trav++;
                continue;
            }

            sb.append(s.charAt(i));
        }

        return(sb.toString());
    }
}
