package math_expection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ruogu on 9/7/14.
 */
public class MathExpection {

    public static int getSum(List<Integer> nums) {
        int sum = 0;
        for(int i = 1; i < nums.size() - 1; ++i) {
            if((nums.get(i) > nums.get(i - 1) && nums.get(i) > nums.get(i + 1))
                || (nums.get(i) < nums.get(i - 1) && nums.get(i) < nums.get(i + 1))) {
                sum += 1;
          }
        }

        return sum;
    }

    public static String getExpectedValue(int n, int k) {
        List<List<Integer>> input = getPermutations(n);
        int size = input.size();
        int sum = 0;
        for(List<Integer> entry : input) {
            sum += Math.pow(getSum(entry), k);
        }
        System.out.println(sum);
        return (new Integer(sum / size)).toString();
    }

    public static List<List<Integer>> getPermutations(int n) {
        List<List<Integer>> perms = new LinkedList<List<Integer>>();
        if(n == 1) {
            List<Integer> entry = new LinkedList<Integer>();
            entry.add(n);
            perms.add(entry);
            return perms;
        }

        List<List<Integer>> ret = getPermutations(n - 1);

        for(List<Integer> entry : ret) {
            for(int i = 0; i <= entry.size(); ++i) {
                List<Integer> entryCopy = new LinkedList<Integer>(entry);
                entryCopy.add(i, n);
                perms.add(entryCopy);
            }


        }
        return perms;
    }


    public static void main(String[] argv) {
        System.out.println(getPermutations(4));
        System.out.println(getExpectedValue(4, 1));
    }
}
