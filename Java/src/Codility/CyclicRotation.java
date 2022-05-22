// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// 87%
class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] arrayUnshifted = A;
        int[] arrayShifted = new int[arrayUnshifted.length];
        int r = K % arrayUnshifted.length;

        if (r == 0) {
            arrayShifted = arrayUnshifted;
            return arrayShifted;
        } else {
            for (int i = 0; i < arrayUnshifted.length; i++) {
                if ((i + r) >= arrayUnshifted.length) {
                    arrayShifted[i + r - arrayUnshifted.length] = arrayUnshifted[i];
                } else {
                    arrayShifted[i + r] = arrayUnshifted[i];
                }
            }
        }

        return arrayShifted;
    }
}

// 100%
// class Solution {
// public int[] solution(int[] A, int K) {
// // write your code in Java SE 8
// int[] S = new int[A.length];

// for (int i = 0; i < A.length; i++) {
// S[(i + K) % A.length] = A[i];
// }

// return S;
// }
// }