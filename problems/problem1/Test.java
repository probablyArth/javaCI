
public class Test {
    public static void main(String[] args) throws Exception {

        Solution solveSolution = new Solution();
        int[] ans = solveSolution.solve(new int[] { 2, 3, 4, 1, 1, 7, 8 });
        int min, max;
        try {
            min = ans[0];
            max = ans[1];
        } catch (Exception e) {
            throw new Error("Runtime Error");
        }
        if (min != 1 || max != 8) {
            throw new Exception("Wrong solution!");
        }
        System.out.print("Testcase passed!");
    }
}
