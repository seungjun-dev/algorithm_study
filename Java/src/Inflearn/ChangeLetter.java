package Inflearn;

import java.util.Scanner;

public class ChangeLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String letter = in.nextLine();
        int answer = 0;

        word = word.toLowerCase();
        letter = letter.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (letter.equals(Character.toString(word.charAt(i)))) {
                answer++;
            }
        }

        System.out.println(answer);

        in.close();

        return;
    }
}
