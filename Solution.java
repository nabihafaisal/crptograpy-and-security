 import java.util.Scanner;
//-----------------ceaser------------------------//
//encryption
// public class solution {
//     public static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";

//     public static String encrypt(String message, int shiftKey) {
//         message = message.toLowerCase();
//         StringBuilder cipherText = new StringBuilder();
//         for (int i = 0; i < message.length(); i++) {
//             char currentChar = message.charAt(i);
//             if (Character.isLetter(currentChar)) {
//                 int charPosition = ALPHA.indexOf(currentChar);
//                 int keyVal = (shiftKey + charPosition) % 26;
//                 if (keyVal < 0) {
//                     keyVal += 26; // Handle negative values
//                 }
//                 char replaceVal = ALPHA.charAt(keyVal);
//                 cipherText.append(replaceVal);
//             } else {
//                 cipherText.append(currentChar); // Keep non-alphabetic characters unchanged
//             }
//         }
//         return cipherText.toString();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String for Encryption:");
//         String message = sc.nextLine();

//         System.out.println("Enter Shift Key:");
//         int key = sc.nextInt();

//         System.out.println("Encrypted msg: " + encrypt(message, key));
//     } // main method ends
// } // Solution Class End

//decryption
public class solution { //to keep track of index
  public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

  public static String decrypt(String cipherText, int shiftKey) {
    cipherText = cipherText.toLowerCase();
    String message = "";
    for (int ii = 0; ii < cipherText.length(); ii++) {
      int charPosition = ALPHABET.indexOf(cipherText.charAt(ii));
      int keyVal = (charPosition - shiftKey) % 26;
      if (keyVal < 0) {
        keyVal = ALPHABET.length() + keyVal;
      }
      char replaceVal = ALPHABET.charAt(keyVal);
      message += replaceVal;
    }
    return message;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message = new String();
    int key = 0;
    System.out.print("Enter the String for Encryption:");
    message = sc.next();

    System.out.println("\n\nEnter Shift Key:");
    key = sc.nextInt();
    // System.out.println("\nEncrpyted msg:"+encrypt(message, key));
    System.out.println("\nDecrypted Message:" + decrypt(message, key));

  }
}