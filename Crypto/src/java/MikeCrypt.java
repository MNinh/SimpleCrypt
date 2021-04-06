public class MikeCrypt extends ROT13{

    public MikeCrypt(){
        this.shift = 22;
    }

    @Override
    public String encrypt(String text) {
        int shift = 22;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char indivChar = text.charAt(i);

            if (indivChar >= 'a' && indivChar <= 'z') {
                indivChar = (char) ((((indivChar + shift) - 'a') % 26) + 'a');
                output.append(indivChar);
            } else if (indivChar >= 'A' && indivChar <= 'Z') {
                indivChar = (char) ((((indivChar + shift) - 'A') % 26) + 'A');
                output.append(indivChar);
            } else {
                output.append(indivChar);
            }
        }

        return output.toString();


    }



    @Override
    public String decrypt(String text) {
        int shift = 22;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char indivChar = text.charAt(i);

            if (indivChar >= 'a' && indivChar <= 'z') {
                indivChar = (char) ((((indivChar + (26 - shift)) - 'a') % 26) + 'a');
                output.append(indivChar);
            } else if (indivChar >= 'A' && indivChar <= 'Z') {
                indivChar = (char) ((((indivChar + (26 - shift)) - 'A') % 26) + 'A');
                output.append(indivChar);
            } else {
                output.append(indivChar);
            }
        }

        return output.toString();
    }

}
