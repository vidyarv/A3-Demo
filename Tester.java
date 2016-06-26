public class Tester {
    public static void main(String[] args) {
        int score = 0;
        int scoreMax = 30;

        // Test 1
        if (FactorialRecursive.compute(0) == 1) {
            System.out.println("Test 1 Passed +10");
            score += 10;
        }
        // Test 2
        if (FactorialRecursive.compute(1) == 1) {
            System.out.println("Test 2 Passed +10");
            score += 10;
        }
        // Test 3
        if (FactorialRecursive.compute(5) == 120) {
            System.out.println("Test 3 Passed +10");
            score += 10;
        }

        if (score != scoreMax) {
            System.out.println("Score: " + score + "/" + scoreMax);
            System.exit(1);
        } else {
            System.out.println("Score: " + score + "/" + scoreMax);
            System.exit(0);
        }
    }
}