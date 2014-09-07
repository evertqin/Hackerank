package red_john_is_back;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruogu on 9/6/14.
 */
public class RedJohnIsBack {

    public static int findAllWays(int n) {
        if(n <= 3) {
            return 1;
        }
        if(n == 4) {
            return 2;
        }

        int[] dp = new int[n];
        dp[0] = dp[1] = dp[2] = 1;
        dp[3] = 2;

        for(int i = 4; i < n; ++i) {
            dp[i] = dp[i - 1] + dp[i - 4];
        }

        return dp[n - 1];
    }

    public static int getPrimes(int n) {
        if(n < 2) {
            return 0;
        }
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        boolean isPrime = true;
        for(int i = 3; i <= n; i+=2) {
            isPrime = true;
            for(int j = 0; j < primes.size() && primes.get(j) <= Math.sqrt(i); ++j) {
                if(i % primes.get(j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) primes.add(i);
        }
        return primes.size();
    }

    public static int process(int n) {
        int ways = findAllWays(n);
        System.out.println(ways);
        int primesCount = getPrimes((ways));
        return primesCount;
    }

}
