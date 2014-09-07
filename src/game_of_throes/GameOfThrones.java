package game_of_throes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ruogu on 9/6/14.
 */
public class GameOfThrones {
    public String canBeAnagram(String input) {
        Set<Character> hashSet = new HashSet<Character>();

        for(Character c : input.toCharArray()) {
            if(hashSet.contains(c)) {
                hashSet.remove(c);
            } else {
                hashSet.add(c);
            }
        }

        return hashSet.size() == 1 || hashSet.size() == 0 ? "YES" : "NO";
    }
}
