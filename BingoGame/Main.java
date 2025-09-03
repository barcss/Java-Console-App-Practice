package BingoGame;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static boolean is_bingo = false;
    static boolean is_playing = true;
    static ArrayList<Character> bingo_letters = new ArrayList<>();
    static int total_letters = 5;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to bingo't gulaman");

        while (is_playing) {
            try {
                print("Input choosen number: " );
                int ipt_num = scan.nextInt();

                if (ipt_num >= 1 && ipt_num <= 15) {
                    checkBingoLetter('b');
                } else if (ipt_num >= 16 && ipt_num <= 30) {
                    checkBingoLetter('i');
                } else if (ipt_num >= 31 && ipt_num <= 45) {
                    checkBingoLetter('n');
                } else if (ipt_num >= 46 && ipt_num <= 60) {
                    checkBingoLetter('g');
                } else if (ipt_num >= 61 && ipt_num <= 75) {
                    checkBingoLetter('o');
                } else {
                    System.out.println("Input number is out of range");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scan.nextLine();
            }

            if (bingo_letters.size() == total_letters) {
                is_bingo = true;
                is_playing = false;
            }
        }
        System.out.println("Congrats mah neighbour");
    }

    private static void print(String msg) {
        System.out.print(msg);
    }

    private static void checkBingoLetter(Character letter) {
        if (bingo_letters.contains(letter)) {
            System.out.println("You've already got letter: " + letter);
        } else {
            bingo_letters.add(letter);
            System.out.print("You've got letter: " + letter + " - ");
            System.out.println(bingo_letters.size() + " out of " + total_letters + "\n");
        }
    }
}