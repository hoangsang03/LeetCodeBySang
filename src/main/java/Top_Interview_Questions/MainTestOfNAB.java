package Top_Interview_Questions;
// you can also use imports, for example:
// import java.util.*;

import java.util.ArrayList;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public class MainTestOfNAB {
    public int solution(String S) {
        // write your code in Java SE 8
        char[] operations = S.toCharArray();
        int topOfStack = -1;
        final int MAX = (int) (Math.pow(2, 20) - 1);
        StringBuilder operator;
        int firstNum;
        int secondNum;
        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == ' ') {
                continue;
            }
            // if operations[i] is digit => push in stack
            if ('0' <= operations[i] && operations[i] <= '9') {
                // get whole number
                operator = new StringBuilder();
                do {
                    operator.append(operations[i]);
                    i++;
                }
                while (i < operations.length && operations[i] != ' ');
                // add number to stack
                stack.add(Integer.parseInt(operator.toString()));
                topOfStack++;

            } // otherwise,  operations[i] is operator -> we need to calculate
            else if (operations[i] == 'P' && topOfStack > -1) {
                // operator is 'POP'
                stack.remove(topOfStack);
                topOfStack--;
                i += 2; // skip 'OP' after 'P' in 'POP'

            } else if (operations[i] == 'D' && topOfStack > -1) {
                // operator is 'DUP'
                stack.add(stack.get(topOfStack));
                topOfStack++;
                i += 2; // skip 'UP' after 'D' in 'DUP'
            } else if (operations[i] == '+' && topOfStack > 0) {
                firstNum = stack.get(topOfStack);
                stack.remove(topOfStack);
                topOfStack--;
                secondNum = stack.get(topOfStack);
                if (firstNum + secondNum > MAX) {
                    return -1;
                }
                stack.set(topOfStack, firstNum + secondNum);

            } else if (operations[i] == '-' && topOfStack > 0) {
                firstNum = stack.get(topOfStack);
                stack.remove(topOfStack);
                topOfStack--;
                secondNum = stack.get(topOfStack);
                // result is negative ?
                if (firstNum - secondNum < 0) {
                    return -1;
                }
                stack.set(topOfStack, firstNum - secondNum);
            } else {
                return -1;
            }
        }
        return stack.get(topOfStack);
    }
}
