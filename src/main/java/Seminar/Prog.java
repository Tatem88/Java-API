package Seminar;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Prog {
    static boolean isCorrectParentheses(String input) {
        Map<Character, Character> pairs = Map.of(
                '(', ')',
                '[', ']',
                '{', '}',
                '<', '>'
        );
        Deque<Character> stack = new ArrayDeque<>();
        //
        // LIFO Last In First Out
        //
        // ] -> [
        // ) -> (
        // } -> {
        // > -> <

        // ((((
        char[] chars = input.toCharArray();
        for (char symbol : chars) { // symbol = ]
            if (pairs.containsKey(symbol)) { // symbol является открывающей скобочкой
                stack.addFirst(symbol);
            } else { // symbol является закрывающей скобочкой
                if (stack.isEmpty()) { // встретили закрывающую, а открывающей раньше не было
                    return false;
                }
                char lastSymbolOpenPair = stack.pollFirst(); // (
                // нужно проверить, что lastSymbol является открывающей по отношению к symbol
                char lastSymbolClosedPair = pairs.get(lastSymbolOpenPair); // )
                if (lastSymbolClosedPair != symbol) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("[](){}")); // true
        System.out.println(isCorrectParentheses("[)")); // false
        System.out.println(isCorrectParentheses("([{}()<>])")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("((")); // false

    }
}
