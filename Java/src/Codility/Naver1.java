// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S) {
        // write your code in Java SE 8

        StringBuilder str = new StringBuilder(S);

        int sLength = str.length();
        for (int i = 0; i < sLength - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                str.deleteCharAt(i);
                break;
            }
        }

        if (sLength == str.length()) {
            str.deleteCharAt(str.length() - 1);
        }

        S = str.toString();

        return S;
    }
}
