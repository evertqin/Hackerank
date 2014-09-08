package bdat_gift;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ruogu on 9/7/14.
 */
public class BDayGift {
    public static List<String> getCombinations(int n) {
        List<StringBuffer> output = new LinkedList<StringBuffer>();
        StringBuffer str = new StringBuffer();
        output.add(str);
        for(int i = 0; i < n; ++i) {
            List<StringBuffer> temp = new LinkedList<StringBuffer>();
            for(StringBuffer s : output) {
                StringBuffer newSB = new StringBuffer(s);
                s.append("0");
                newSB.append("1");
                temp.add(newSB);

            }
            output.addAll(temp);
        }

        List<String> ret = new LinkedList<String>();
        for(StringBuffer sb : output) {
            ret.add(sb.toString());
        }

        return ret;
    }

    public static double getExpectedValue(int[] nums) {
        List<String> mask = getCombinations(nums.length);
        double expectedValue = 0;
        double probability = Math.pow(0.5, nums.length);
        for(String s : mask) {
            int sum = 0;
            for(int i = 0; i < s.length(); ++i) {
                if(s.charAt(i) == '1') {
                    sum += nums[i];
                }
            }
            expectedValue += probability * sum;

        }
        return expectedValue;
    }

    public static double getValue(int[] nums) {
        int n = nums.length;
        double sum = 0;
        for(int i = 0; i < n; ++i) {
            sum += nums[i] * Math.pow(2, n - 1);
        }
        return sum / Math.pow(2, n);
    }

    public static void main(String[] argv) {
        int nums[] = {83585249	,
                4730635	,
                72147488	,
                61929863	,
                64304366	,
                85551769	,
                55087638	,
                2094884	,
                78232644	,
                45548638	,
                43504052	,
                56694287	,
                72874747	,
                74114947	,
                23687041	,
                8043461	,
                18204290	,
                97004955	,
                33021116	,
                93183695	,
                22975859	,
                24557663	,
                30955998	,
                58141954	,
                56226908	,
                44335205	,
                60836538	,
                85003546	,
                39120371	,
                90289960	,
                69995749	,
                75221962	,
                95020585	,
                42143228	,
                37151815	,
                59324942	,
                80211339	,
                92239443
        };
        System.out.format("%.1f",getValue(nums));
    }

}
