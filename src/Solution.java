import java.util.Arrays;

class Solution {
    static public boolean isAnagram(String s, String t) {

        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        System.out.println(sArr);

        char[] tArr = t.toCharArray();

        Arrays.sort(tArr);
        System.out.println(tArr);

        return Arrays.equals(tArr,sArr);
        
    }

    public static void main(String[] args) {
        String s = "tar";
        String t = "rat";

        System.out.print(isAnagram(s,t));
    }
}

