package com.Day2PracticeProblem;

import java.util.Scanner;

public class Switch_Q1_VowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char ch = sc.nextLine().charAt(0);
       
        switch (ch) { 
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;

            default:
                System.out.println(ch + " is a consonant.");
        }
	}

}
