package HashMap;

import java.util.HashMap;

public class BestAlbum {
    public static void main(String[] args) {
        String[] g = { "classic", "pop", "classic", "classic", "pop" };
        int[] p = { 500, 600, 150, 800, 2500 };
        solution(g, p);
    }

    public static String solution(String[] genres, int[] plays) {
        // int[] answer = {};
        String answer = "";
        HashMap<String, Integer> album = new HashMap<String, Integer>();

        for (int i = 0; i < genres.length; i++) {
            album.put(genres[i], album.getOrDefault(genres[i], 0) + plays[i]);
        }

        // ex) [4, 1, 3, 0]
        System.out.println(album.entrySet());
        return answer;
    }

}