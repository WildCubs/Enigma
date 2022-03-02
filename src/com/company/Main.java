package com.company;

import java.util.Scanner;

public class Main {

    Scanner keybdINput = new Scanner(System.in);
    String sourceText;
    boolean inDecryptionMode = false;
    //String[] arrayedCode = new String[10];

    public char[] alphabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};
    public int[] numberCiphers = new int[30];

    public int letter2number(char soughtLetter) {
        int position = -1;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == soughtLetter) {
                position = i;
                break;
            }
        }
        return position;
    }

    public char number2letter(int soughtNumber) {
        char revertedOutput = '*';
        for (int i = 0; i < numberCiphers.length; i++) {
            numberCiphers[i] = i;
            if (numberCiphers[i] == soughtNumber) {
                revertedOutput = (alphabet[i]);
                break;
            }
        }
        return revertedOutput;
    }

    public void displayOutput(String output) {
        System.out.println("Result: " + output);
    }

    public String useNumberCipher(int shift) {
        System.out.println("Enter text to encrypt:");
        String input = keybdINput.next();
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            encryptedText.append(letter2number(input.charAt(i)) + shift);
            encryptedText.append(".");
        }
        return encryptedText.toString();
    }

    public String useVigenéreCipher(String keyword) {
        if (inDecryptionMode = false);
        System.out.println("Enter text to encrypt:");
        String input = keybdINput.next();
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int factor = letter2number(input.charAt(i));
            int newPosition = i + factor;
            char letter = number2letter(newPosition);
            encryptedText.append(letter);
        }
        return encryptedText.toString();
    }

    public String useCaesarCipher(int shift) {
        if (inDecryptionMode = false);
        System.out.println("Enter text to encrypt");
        String input = keybdINput.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int mutant = letter2number(input.charAt(i));
            mutant += shift;
            char letter = number2letter(mutant);
            encryptedText.append(letter);
        }
        return encryptedText.toString();
    }

    public void mainMenu() {
        System.out.println("Choose next encryption wheel: (1) Caesar Cipher, (2) Vigenère Cipher, (3) Number Cipher");
        int userChoice = keybdINput.nextInt();

        switch (userChoice) {
            case 1 :
                System.out.println("Enter shift value:");
                int shift = keybdINput.nextInt();
                String result = useCaesarCipher(shift);
                displayOutput(result);
                break;
            case 2 :
                System.out.println("Enter keyword:");
                String keyword = keybdINput.nextLine();
                useVigenéreCipher(keyword);
                break;
            case 3 :
                System.out.println("Enter shift value:");
                shift = keybdINput.nextInt();
                useNumberCipher(shift);
                break;
        }
    }

    public static void main(String[] args) {
        Main getMe = new Main();
        getMe.mainMenu();
        //getMe.displayOutput(getMe.useCaesarCipher(3));
        //getMe.displayOutput(getMe.useNumberCipher(1));
        //getMe.displayOutput(getMe.useVigenéreCipher("ABC"));
    }
}




