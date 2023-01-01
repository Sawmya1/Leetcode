class Solution {
    public int calculate(String s) {
        if(s==null)
          return 0;
        int res=0, sign=1, num=0;
        Stack<Integer> st = new Stack<Integer>();
        st.push(sign);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9')  //Character.isDigit(c)
              num = num * 10 + ( c - '0');
            else if(c == '+' || c == '-'){
                res += sign * num; //-ve or =ve
                sign = st.peek() * (c == '+' ? 1:-1);
                num = 0;
            }else if(c=='(')
              st.push(sign);
            else if(c == ')') 
              st.pop();
        }
        res += sign * num;
        return res;
    }
}