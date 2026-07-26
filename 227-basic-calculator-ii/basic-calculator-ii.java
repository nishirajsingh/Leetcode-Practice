class Solution {
    public int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        return 2; 
    }
    public void evaluate(Stack<Integer> nums, Stack<Character> ops) {
        int b = nums.pop();
        int a = nums.pop();
        char op = ops.pop();
        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b; 
                break;
        }
        nums.push(result);
    }
    public int calculate(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<Character> ops = new Stack<>();
        int n = s.length();
        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                i++;
                continue;
            }
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                nums.push(num);
                continue;
            }
             while (!ops.isEmpty() &&
                precedence(ops.peek()) >= precedence(ch)) {
                evaluate(nums, ops);
            }
            ops.push(ch);
            i++;
        }
        while (!ops.isEmpty()) evaluate(nums, ops);
        return nums.pop();
    }
}