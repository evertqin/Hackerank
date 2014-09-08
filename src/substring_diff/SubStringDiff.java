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


 /*   public static int getDiff(final String str1,
                              final String str2, final int numDiff) {
        int n = str1.length();
        int count[] = new int[n];
        for(int i = 0; i < n; ++i) {
            count[i] = str1[i] == str2[i] ? 1 : 0;
        }

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {

            }
        }*/



  //  }

    public static void main(String[] Argv) {
        System.out.println("Running");
        //System.out.println(getDiff("tabriz", "torino", 2));
    }
}
