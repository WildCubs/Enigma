package com.company;

import java.util.Scanner;

public class Main {

    Scanner keybdINput = new Scanner(System.in);
    String sourceText;
    boolean inDecryptionMode = false;

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

    public String[] getSourceText() {
        System.out.println("Please input first source text or stub");
        sourceText = keybdINput.nextLine();

        String[] arrayedCode = new String[10];
        for (int i = 0; i < 11; i++) {
            if (sourceText = "ENIGMA") {
                break;
            }
            arrayedCode[i] = sourceText;
            return arrayedCode;
        }

        System.out.println("Enter next source stub, or type ENIGMA to encrypt!");
    }

    /*
    public char installFromVigenèreWheel(boolean inDecryptionMode) {

        return modifiedValue;
    }

    public char installFromCaesarWheel(boolean inDecryptionMode) {
        char modifiedValue =  ;
        return modifiedValue;
    }

    public String installFromNumberWheel(boolean inDecryptionMode, char input) {

        String modifiedOutput;

        for (int i = 0; i <= getSourceText().length; i++) {
            if (inDecryptionMode = false);
            modifiedValue = letter2number(input);

        }
        return modifiedOutput;
    }

    public void wheelMenu() {
        System.out.println("Choose next codewheel: (1) Number Cipher, (2)Caesar Cipher, (3)Vigenère Cipher");

        int wheelChoice = keybdINput.nextInt();
        StringBuilder codedText = new StringBuilder();

        switch (wheelChoice) {
            case 1:
                codedText.append(installFromNumberWheel);
            case 2:
                installFromCaesarWheel;
            case 3:
                installFromVigenèreWheel;

        }
    }
/*
    public void displayDirectionMenu() {
        System.out.println("ENIGMA - recursive encryption");
        System.out.println("-----------------------------");
        System.out.println("Do you want to (E)ncrypt, or (D)ecrypt?");

        String sendOrReceiveChoice = keybdINput.next();
        if ("E".equals(sendOrReceiveChoice)) {
            wheelMenu(false);
        } else {                                    // anything else
            wheelMenu(true);
        }
    }
*/
    public static void main(String[] args) {
	Main getMe = new Main();
        System.out.println("Type sourcetext");
        System.out.println(getMe.getSourceText());
    }
}
