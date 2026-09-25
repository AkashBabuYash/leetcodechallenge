import java.math.BigInteger;

class Solution {
    public int numTrees(int n) {
        BigInteger fact2n = BigInteger.ONE;
        BigInteger factN = BigInteger.ONE;
        BigInteger factN1 = BigInteger.ONE;

        // (2n)!
        for (int i = 1; i <= 2 * n; i++) {
            fact2n = fact2n.multiply(BigInteger.valueOf(i));
        }

        // n!
        for (int i = 1; i <= n; i++) {
            factN = factN.multiply(BigInteger.valueOf(i));
        }

        // (n + 1)!
        for (int i = 1; i <= n + 1; i++) {
            factN1 = factN1.multiply(BigInteger.valueOf(i));
        }

        BigInteger ans = fact2n.divide(factN1.multiply(factN));

        return ans.intValue();
    }
}