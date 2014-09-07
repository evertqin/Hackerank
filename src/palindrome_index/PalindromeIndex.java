package palindrome_index;

import java.util.Scanner;

/**
 * Created by ruogu on 9/6/14.
 */
public class PalindromeIndex {
    public static boolean isPaline(String word) {
        int start = 0, end = word.length() - 1;
        while(start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static int palindromeIndex(String word) {
        if(isPaline(word)) {
            return -1;
        }

        for(int i = 0; i < word.length(); ++i) {
            StringBuilder sb = new StringBuilder(word);
            sb.deleteCharAt(i);
            if(isPaline(sb.toString())) {
                return i;
            }

        }
        return -1;
    }

    public static int getPlaindromeIndex(String word) {
        int start = 0, end = word.length() - 1;
        while(start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(start);
                if(isPaline(sb.toString())) {
                    return start;
                } else {
                    return end;
                }

            }
            start++;
            end--;
        }
        return -1;
    }

    public static void main(String[] word) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String line;
        while(in.hasNext()) {
            line = in.nextLine();
            System.out.println(getPlaindromeIndex(line));
        }
    }
}
