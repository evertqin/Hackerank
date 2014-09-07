package substring_diff;

import main.Main;

/**
 * Created by ruogu on 9/7/14.
 */

class Meta {
    public int length = 0;
    public int diff  = 0;
    Meta(int length, int diff) {
        this.length = length;
        this.diff = diff;
    }

    Meta(Meta m) {
        this.length = m.length;
        this.diff = m.diff;
    }
}

public class SubStringDiff {


    public static int getDiff(final String str1,
                              final String str2, final int numDiff) {
        if (str1.length() <= numDiff) {
            return str1.length();
        }

        int n = str1.length();
        Meta dp[][] = new Meta[n][n];
        for(int i = 0; i < n; ++i) {
            dp[0][i] = str1.charAt(0) == str2.charAt(i) ? new Meta(1, 0) : new Meta(1, 1);
        }
        for(int i = 1; i < n; ++i) {
            dp[i][0] = str1.charAt(i) == str2.charAt(0) ? new Meta(1, 0) : new Meta(1, 1);
        }

        for(int i = 1; i < n; ++i) {
            for(int j =1; j < n; ++j) {
               if(str1.charAt(i) == str2.charAt(j)) {
                   Meta temp = new Meta(dp[i - 1][j - 1]);
                   temp.length++;
                   dp[i][j] = temp;
               } else {
                    if(dp[i - 1][j - 1].diff < numDiff) {
                        Meta temp = new Meta(dp[i - 1][j - 1]);
                        temp.length++;
                        temp.diff++;
                        dp[i][j] = temp;
                    } else {

                    }
               }
            }
        }




    }

    public static void main(String[] Argv) {
        System.out.println("Running");
        System.out.println(getDiff("tabriz", "torino", 2));
    }
}
