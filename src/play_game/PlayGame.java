package play_game;

import java.util.Vector;

/**
 * Created by ruogu on 9/6/14.
 */
abstract class Test {
    public abstract void test();
}
class TestImp extends Test {
    @Override
    public void test() {
        
    }


}

class TestTest extends TestImp {
    @Override
    public void test() {
        System.out.println("TestTest");
    }
    protected void tryIt() {
        System.out.println("Try it");
    }
}
class TestTestTest extends  TestTest {
    @Override
    public void test() {
        super.test();

    }

    @Override
    public  void tryIt() {
        System.out.println("Try it in TestTEstTEst");
    }


}



public class PlayGame {

   /* public static int getOptimal(int[] nums) {

        if(nums.length <= 3) {
            int sum = 0;
            for(int i : nums) {
                sum+= i;

            }
            return sum;
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = nums[1] + dp[0];
        dp[2] = nums[2] + dp[1];

        int[] oppo = new int[nums.length];
        oppo[0] = 0;


        for(int i = 3; i < nums.length; ++i) {
           // dp[i] = Math.max(dp[i - 3], dp[])
        }

    }*/

    public static void main(String[] argv) {
        TestTestTest t = new TestTestTest();
        t.tryIt();
        TestTest tt = new TestTest();
        tt.tryIt();
    }
}
