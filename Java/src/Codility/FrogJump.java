public class FrogJump {
    public static void main(String[] args) {
        String S = "hot";
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
        System.out.println(S);

        // return S;
    }
}
