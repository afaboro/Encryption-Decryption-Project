package encryptdecrypt;

import java.util.Scanner;

public class DecryptionSupport {

    /**
     * This method determines whether to encrypt or decrypt the message, then runs the decrypt or encrypt methods
     * @param o option - dec or enc
     * @param message message to encrypt or decrypt
     * @param key key used to encrypt or decrypt
     * @return the encrypted or decrypted message
     */
    public String choose(String o, String message, int key){
        if(o.equals("enc")){
            return encrypt(message, key);
        } else if(o.equals("dec")) {
            return decrypt(message, key);
        }
        return "Unknown option";
    }

    /**
     * This method decrypts an encrypted message
     * @param in encrypted message to be decrypted
     * @param key key used to decrypt the message
     * @return decrypted message
     */
    public String decrypt(String in, int key){
        String out = "";
        int newValue = 0;
        int value = 0;
        for(int i = 0; i < in.length(); i++){
            char c = in.charAt(i);
            value = c;
            newValue = value - key;
            c = (char)newValue;
            out += c;
        }
        return out;
    }

    /**
     * method encrypts a message
     * @param in message to be encrypted
     * @param key used to encrypt the message
     * @return encrypted message
     */
    public String encrypt(String in, int key){
        String out = "";
        int newValue = 0;
        int value = 0;
        for(int i = 0; i < in.length(); i++){
            char c = in.charAt(i);
            value = c;
            newValue = value + key;
            c = (char)newValue;
            out += c;
        }
        return out;
    }


    public static void main(String[] args){
        DecryptionSupport d = new DecryptionSupport();
        Scanner s = new Scanner(System.in);

        String opt = s.nextLine();
        String in = s.nextLine();
        int key = s.nextInt();

        String o = d.choose(opt, in, key);
        System.out.println(o);
    }
}
