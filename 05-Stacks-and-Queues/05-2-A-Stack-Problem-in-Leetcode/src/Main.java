public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = null;
        // 输入：s = "()[]{}"
        // 输出：true
        s = "()[]{}";
        System.out.println(solution.isValid(s));

        // 输入：s = "([)]"
        // 输出：false
        s = "([)]";
        System.out.println(solution.isValid(s));
    }
}
