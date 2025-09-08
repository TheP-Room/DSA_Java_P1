import java.util.Stack;

public class StringReverser {
    public static String reverse(String input){
        if (input == null)
            throw new IllegalArgumentException();
        Stack<Character> stringStack = new Stack<>();
        for (char alphabet : input.toCharArray())
            stringStack.push(alphabet);
        StringBuilder reversed = new StringBuilder();
        while(!stringStack.empty())
            reversed.append(stringStack.pop());
        return reversed.toString();
    }
}
