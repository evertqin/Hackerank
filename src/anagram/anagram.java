package anagram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ruogu on 9/7/14.
 */
public class anagram {
    public static int changes(String input) {
        if((input.length() & 0x1) != 0) {
            return -1;
        }

        String str1 = input.substring(0, input.length()/2);
        String str2 = input.substring(input.length()/2);


        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        for(int i = 0; i < str1.length(); ++i) {
            Character thisChar = str1.charAt(i);
            if(hash.containsKey(thisChar)){
                hash.put(thisChar,hash.get(thisChar) + 1);
            } else {
                hash.put(thisChar,1);
            }
        }

        for(Character c : str2.toCharArray()) {
            if(hash.containsKey(c)) {
                int val = hash.get(c);
                val--;
                if(val == 0) {
                    hash.remove(c);
                } else {
                    hash.put(c, val);
                }
            }
        }

        int count = 0;
        for(Map.Entry<Character, Integer> entry: hash.entrySet()) {
            count += entry.getValue();
        }

        return count;

    }

    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        while(in.hasNext()) {
            System.out.println(changes(in.nextLine().trim()));
        }
    }
}
