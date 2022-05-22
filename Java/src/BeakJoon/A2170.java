package BeakJoon;

import java.io.*;
import java.util.Arrays;

public class A2170 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numOfLines = 0;
        int[][] xyList;
        String xyValue;
        // int totalLength = 0;

        System.out.print("선의 수: ");
        numOfLines = Integer.parseInt(input.readLine());

        xyList = new int[numOfLines][2];

        for (int i = 0; i < numOfLines; i++) {
            System.out.print("좌표: ");
            xyValue = input.readLine();
            xyList[i][0] = Integer.parseInt(xyValue.split("\\s")[0]);
            xyList[i][1] = Integer.parseInt(xyValue.split("\\s")[1]);
        }

        // 2차원 배열 오름차순 정리
        Arrays.sort(xyList, (a1, a2) -> {
            if (a1[0] == a2[0]) {
                return Integer.compare(a1[1], a2[1]);
            } else {
                return Integer.compare(a1[0], a2[0]);
            }
        });

        int xValue = xyList[0][0];
        int yValue = xyList[0][1];
        // int totLength = yValue - xValue;
        // for (int i = 1; i < numOfLines; i++) {
        // if()
        // }
    }
}
