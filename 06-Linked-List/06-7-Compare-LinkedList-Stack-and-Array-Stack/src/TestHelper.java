import java.util.Random;

public class TestHelper {
    public static double testStack(Stack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++)
            stack.push(random.nextInt(Integer.MAX_VALUE));
        for (int i = 0; i < opCount; i++)
            stack.pop();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}
