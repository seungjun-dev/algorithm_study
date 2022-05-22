// // you can also use imports, for example:
// // import java.util.*;

// // you can write to stdout for debugging purposes, e.g.
// // System.out.println("this is a debug message");
// import java.util.HashSet;

// class Solution {
// public int solution(int X, int[] A) {
// // write your code in Java SE 8
// int result = -1;

// HashSet<Integer> bank = new HashSet<Integer>();

// for (int i = 0; i < A.length; i++) {
// bank.add(A[i]);
// if (bank.size() == X) {
// result = i;
// break;
// }
// }
// return result;
// }
// }