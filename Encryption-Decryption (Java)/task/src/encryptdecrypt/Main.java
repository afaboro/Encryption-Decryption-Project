package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public String choose(String o, String message, int key){
        if(o.equals("enc")){
            return encrypt(message, key);
        } else if(o.equals("dec")) {
            return decrypt(message, key);
        }
        return "Unknown option";
    }
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

    /*public File outputFile(String o, String message, int key) throws IOException {
        String s = choose(o, String message, key);
        String path = "";
        File file = new File(path);
        try (FileWriter f = new FileWriter(file)) {

        }


        return out;
    }*/

    public void eightArgs(String[] args){
        String mode = "";
        String msg = "";
        String inFile = "";
        String outFile = "";
        int key = 0;

        for(int i = 0; i < args.length; i++){
            if(i+1 < args.length){
                if(i % 2 == 0){
                    switch(args[i]){
                        case "-mode":
                            mode = args[i+1];
                            break;
                        case "-key":
                            key = Integer.parseInt(args[i+1]);
                            break;
                        case "-in":
                            inFile = args[i+1];
                            break;
                        case "out":
                            outFile = args[i+1];
                            break;
                    }
                }
            }
        }

    }

    public void sevenArgs(String[] args){}

    /**
     * This method incorporates command line arguments with 6 arguments
     * Prints the encrypted/decrypted message
     * @param args arguments from the command line
     */
    public void sixArgs(String[] args){
        String mode = "";
        String data = "";
        int key = 0;

        for(int i = 0; i < args.length; i++){
            if(i+1 < args.length) {
                if (i % 2 == 0) {
                    switch (args[i]) {
                        case "-mode":
                            mode = args[i + 1];
                            break;
                        case "-key":
                            key = Integer.parseInt(args[i + 1]);
                            break;
                        case "-data":
                            data = args[i + 1];
                            break;
                    }
                }
            }
        }
        System.out.println(choose(mode, data, key));
    }

    /**
     * This method incorporates command line arguments with 5 arguments
     * Prints the encrypted/decrypted message
     * @param args arguments from the command line
     */
    public void fiveArgs(String[] args){
        String mode = "";
        String data = "";
        int key = 0;

        for(int i = 0; i < args.length; i++){
            switch(args[i]){
                case "-mode":
                    if(args[i+1].startsWith("-") || (i+1 == args.length)){
                        mode = "enc";
                    }
                    break;
                case "-key":
                    key = Integer.parseInt(args[i+1]);
                    break;
                case "-data":
                    data = args[i+1];
                    break;
                default:
                    break;
            }
        }
        System.out.println(choose(mode, data, key));
    }

    /**
     * This method incorporates command line arguments with 4 arguments
     * Prints the encrypted/decrypted message
     * @param args arguments from the command line
     */
    public void fourArgs(String[] args){
        String mode = "";
        String data = "";
        int key = 0;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < args.length; i++){
            switch(args[i]){
                case "-mode":
                    mode = args[i+1];
                    break;
                case "-data":
                    data = s.nextLine();
                    key = s.nextInt();
                    break;
                default:
                    break;
            }
        }
        System.out.println(choose(mode, data, key));
    }

    /**
     * This method incorporates command line arguments with 3 arguments
     * Prints the encrypted/decrypted message
     * @param args arguments from the command line
     */
    public void threeArgs(String[] args){
        String mode = "";
        String data = "";
        int key = 0;

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < args.length; i++){
            switch(args[i]){
                case "-mode":
                    mode = "enc";
                    break;
                case "data":
                    data = s.nextLine();
                    key = s.nextInt();
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main d = new Main();
        if(args.length == 6){
            d.sixArgs(args);
        } else if(args.length == 5){
            d.fiveArgs(args);
        } else if(args.length == 4){
            d.fourArgs(args);
        } else if(args.length == 3){
            d.threeArgs(args);
        } else {
            Scanner s = new Scanner(System.in);

            String opt = s.nextLine();
            String in = s.nextLine();
            int key = s.nextInt();

            String o = d.choose(opt, in, key);
            System.out.println(o);
        }
    }

}