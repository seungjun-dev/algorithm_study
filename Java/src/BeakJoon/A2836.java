package BeakJoon;

import java.io.*;

public class A2836 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(str.split("\\s")[0]);
        // int m = Integer.parseInt(str.split("\\s")[1]);

        int[][] taxi = new int[n][2];

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            taxi[i][0] = Integer.parseInt(str.split("\\s")[0]);
            taxi[i][1] = Integer.parseInt(str.split("\\s")[1]);
        }

    }
}
