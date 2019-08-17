import stackData.MyStack;

public class ReverseString {
    private MyStack<Character> stack;

    public String reverse(String data) {
        stack = new MyStack<>(data.length());
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            stack.push(data.charAt(i));
        }
        while(!stack.isEmpty()) {
            temp.append(stack.pop());
        }
        return temp.toString();
    }
}
