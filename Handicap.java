package Handicaps;

import java.util.Scanner;
import java.util.LinkedList;

public class Handicap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Round> rounds = new LinkedList<>();
        boolean stay = true;
        while (stay) {
            System.out.println("Would you like to (1) Add a new round, (2) Check your handicap, or (3) Exit");
            byte answer = scanner.nextByte();
            while (!(answer == 1 || answer == 2 || answer == 3)) {
                System.out.println("Would you like to (1) Add a new round, (2) Check your handicap, or (3) Exit");
                answer = scanner.nextByte();
            }
            if (answer == 1) {
                System.out.println("Enter round score: ");
                System.out.println("Enter round course rating: ");
                System.out.println("Enter round slope rating: ");

                Round newest = new Round();

                if (rounds.size() < 20) {
                    rounds.add(newest);
                    System.out.println(rounds.size());
                }
                else {
                    rounds.remove(0);
                    rounds.add(newest);
                }
            }
            if (answer == 2){

            }
            if (answer == 3) {
                stay = false;
            }
        }
    }

    public void updateHandicap(LinkedList<Round> totalRounds) {
        double scoreDifTotal = 0;
        double[] scoreDifs = new double[20];
        for (int i = 0; i < totalRounds.size(); i++) {
            scoreDifs[i] = totalRounds.get(i).scoreDifferential;
        }

//        for (double element : scoreDifs) {
//            System.out.println(element);
//        }
    }

}
