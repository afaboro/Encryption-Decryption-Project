package encryptdecrypt;

import java.util.Scanner;

public class KeyEncryption {

    public String keyEncrypt(String input, int key){
        String output = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int newIndex = 0;
        for(int i = 0; i < input.length();i++){
            char c = input.charAt(i);
            if(!Character.isLetter(c)){
                output += c;
            } else {
                for(int j = 0; j < alpha.length(); j++){
                    char a = alpha.charAt(j);
                    if(c == a){
                        newIndex = j + key;
                        if(newIndex > alpha.length()){
                            newIndex = newIndex - alpha.length();
                            output += alpha.charAt(newIndex);
                        } else {
                            output += alpha.charAt(newIndex);
                        }
                    }
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        KeyEncryption k = new KeyEncryption();
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter text");
        String keyIn = s.nextLine();
        int keyNum = s.nextInt();
        System.out.println(k.keyEncrypt(keyIn, keyNum));
    }

}