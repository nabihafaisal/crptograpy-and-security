import java.util.Arrays;

public class morseCode {

    static String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0","!", ",", "?", ".", "'"};

    static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----","-.-.--", "--..--", "..--..", ".-.-.-", ".----.",};

    public static String decode(String morseCode) {
        StringBuilder build = new StringBuilder();
        String change = morseCode.trim();
        String[] words = change.split("   ");
        for (String word : words) {
            for(String letter : word.split(" ")){
                for(int x=0;x<morse.length;x++){
                    if(letter.equals(morse[x]))
                        build.append(alpha[x]);
                }
            }
            build.append(" ");
        }
        
        return build.toString().toUpperCase();
    }

    public static String decodeEnglish(String englishCode) {
        StringBuilder build = new StringBuilder();
        String change = englishCode.trim();
        String[] words = change.split(" ");
        for(String word : words){
            for(int i=0;i<word.length();i++){
                for(int x=0; x<morse.length;x++){
                    if(word.substring(i, i+1).equalsIgnoreCase(alpha[x])){
                        build.append(morse[x]).append(" ");
                    }
                }
            }
        }
        
        return build.toString();
    }
         
    public static void main(String[] args){
        System.out.println(decodeEnglish("hello my name is broque, what is your name?"));
        System.out.println(decode(".... . .-.. .-.. ---   -- -.--   -. .- -- .   .. ...   -... .-. --- --.- ..- . --..--   .-- .... .- -   .. ...   -.-- --- ..- .-.   -. .- -- . ..--..   "));
    }
}
