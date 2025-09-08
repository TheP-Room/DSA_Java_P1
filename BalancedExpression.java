import java.util.Stack;

public class BalancedExpression {
    private static final char[] left = {'(','<','{','['};
    private static final char[] right = {')','>','}',']'};

    private static boolean isLeft(char input){
        for (char lefts : left)
            if (input == lefts) return true;
        return false;
    }

    private static boolean isRight(char input){
        for (char rights : right)
            if (input == rights) return true;
        return false;
    }

    public static boolean isBalanced(String input){
        Stack<Character> openings = new Stack<>();
        for (char character : input.toCharArray()){
            if (isLeft(character))
                openings.push(character);
            if (isRight(character))
                if (openings.empty()) return false;
                else{
                    var top = openings.pop();
                    if ((int) top != (int) character - 1
                            && (int) top != (int) character - 2)
                        return false;
                }
        }
        return openings.empty();
    }
}
