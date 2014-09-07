package main;

import red_john_is_back.RedJohnIsBack;

import java.util.Scanner;

/**
 * Created by ruogu on 9/6/14.
 */
public class Main {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        int caseCount = in.nextInt();
        int n = 0;

        while(in.hasNext()) {
            n = in.nextInt();
            System.out.println(RedJohnIsBack.process(n));
        }
    }
}
