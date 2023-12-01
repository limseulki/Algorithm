import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        String[] str = s.split("");
        Stack<String> st = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            if (!st.isEmpty() && st.peek().equals(str[i])) {
                st.pop();
            } else {
                st.push(str[i]);
            }
        }

        if(st.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}