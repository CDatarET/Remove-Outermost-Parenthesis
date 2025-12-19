public class Solution {
    public string RemoveOuterParentheses(string s) {
        int stack = -1;
        int[] pairs = new int[s.Length];
        int r = -1;

        for(int i = 0; i < s.Length; i++){
            if(s[i] == '('){
                if(stack == -1) pairs[++r] = i;
                stack++;
            }
            else stack--;

            if(stack == -1) pairs[++r] = i;
        }

        string ret = "";
        int trav = 0;
        for(int i = 0; i < s.Length; i++){
            if(i == pairs[trav]){
                trav++;
                continue;
            }

            ret = ret + "" + s[i];
        }

        return(ret);
    }
}
