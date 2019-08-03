package encryptdecrypt;

import java.util.Scanner;

public class ManualEncryption {

    /**
     * manEncrypt accepts a String and outputs an encrypted form of the String
     * Note: This method produces the ciphertext by encrypting the String manually
     * @param input a String
     * @return encrypted form of input
     */
    public String manEncrypt(String input){
        String output = "";
        for(int i = 0; i < input.length();i++){
            char b = input.charAt(i);
            switch (b){
                case 'a': output += "z";
                    break;
                case 'b': output += "y";
                    break;
                case 'c': output += "x";
                    break;
                case 'd': output += "w";
                    break;
                case 'e': output += "v";
                    break;
                case 'f': output += "u";
                    break;
                case 'g': output += "t";
                    break;
                case 'h': output += "s";
                    break;
                case 'i': output += "r";
                    break;
                case 'j': output += "q";
                    break;
                case 'k': output += "p";
                    break;
                case 'l': output += "o";
                    break;
                case 'm': output += "n";
                    break;
                case 'n': output += "m";
                    break;
                case 'o': output += "l";
                    break;
                case 'p': output += "k";
                    break;
                case 'q': output += "j";
                    break;
                case 'r': output += "i";
                    break;
                case 's': output += "h";
                    break;
                case 't': output += "g";
                    break;
                case 'u': output += "f";
                    break;
                case 'v': output += "e";
                    break;
                case 'w': output += "d";
                    break;
                case 'x': output += "c";
                    break;
                case 'y': output += "b";
                    break;
                case 'z': output += "a";
                    break;
                default: output += b;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        ManualEncryption m = new ManualEncryption();
        System.out.println(m.manEncrypt("we found a treasure!"));
    }

}