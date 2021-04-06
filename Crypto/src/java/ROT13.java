import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    public Integer shift;

    ROT13(Character cs, Character cf) {
        if(cf - cs > 0) {
            this.shift = cf - cs;
        }
        else if(cf - cs < 0){
            this.shift = -(cf - cs);
        }
    }

    ROT13() {
        this.shift = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        int shift = 13;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char indivChar = text.charAt(i);

            if (indivChar >= 'a' && indivChar <= 'z') {
                indivChar = (char) ((indivChar - 'a' + shift) % 26 + 'a');
                output.append(indivChar);
            } else if (indivChar >= 'A' && indivChar <= 'Z') {
                indivChar = (char) ((indivChar - 'A' + shift) % 26 + 'A');
                output.append(indivChar);
            } else {
                output.append(indivChar);
            }
        }
        return output.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        String rotated = s.substring(s.indexOf(c), s.length()) + s.substring(0, s.indexOf(c));
        return rotated;
    }

//        Integer shift = c - 'A';
//        int lengthOfInput = s.length();
//        StringBuilder output = new StringBuilder();
//
//        for (int i = 0; i < lengthOfInput; i++) {
//            char indivChar = s.charAt(i);
//            char newChar = indivChar;
//
//            if (newChar >= 'a' && newChar <= 'z') {
//                newChar = (char) ((indivChar - 'a' + shift) % 26 + 'a');
//                output.append(newChar);
//            } else if (newChar >= 'A' && newChar <= 'Z') {
//                newChar = (char) ((indivChar - 'A' + shift) % 26 + 'A');
//                output.append(newChar);
//            } else {
//                output.append(indivChar);
//            }
//        }
//        System.out.println(output.toString());
//        return output.toString();


}
