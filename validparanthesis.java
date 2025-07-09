import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class validparanthesis {
  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    for (final char c : s.toCharArray())
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;

    return stack.isEmpty();
  }
    public static void main(String[] args) {
        validparanthesis vp = new validparanthesis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of parentheses: ");
        String input = scanner.nextLine();
        boolean result = vp.isValid(input);
        System.out.println(result);
        scanner.close();
    }
}
 

