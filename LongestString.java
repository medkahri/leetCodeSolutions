import java.util.HashSet;
import java.util.Set;

class LongestString {
    public static int lengthOfLongestSubstring(@NotNull String s) {

        Set<Character> set = new HashSet<>();
        Integer left=0;
        Integer right=0;
        Integer max = 0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
            }
            else {
                max=Math.max(max,set.size());
                set.remove(s.charAt(left));
                left++;
            }

        }


        return Math.max(max,set.size());
    }
}

