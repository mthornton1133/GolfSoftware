package Handicaps;

import java.util.PriorityQueue;
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
                    updateHandicap(rounds);
                }
                else {
                    rounds.remove(0);
                    rounds.add(newest);
                    updateHandicap(rounds);
                }
            }
            if (answer == 2) {

            }
            if (answer == 3) {
                stay = false;
            }
        }
    }

    public static double updateHandicap(LinkedList<Round> totalRounds) {
        double scoreDifTotal = 0.0;
        double[] scoreDifs = new double[20];
        for (int i = 0; i < totalRounds.size(); i++) {
            scoreDifs[i] = totalRounds.get(i).scoreDifferential;
        }

        sortArray(scoreDifs);

        for (double vals : scoreDifs) {
            System.out.print(vals + " ");
        }

        for (double value : scoreDifs) {
            scoreDifTotal += value;
        }

        double handicap = scoreDifTotal / 8;

        System.out.println(handicap);
        return handicap;
    }
    public static double[] sortArray(double[] inputArray) {
        if (inputArray.length >= 8 ) {
            PriorityQueue<Double> PQ = new PriorityQueue<>(8);
            for (double i : inputArray) {
                PQ.add(i);
                if (PQ.size() > 8) {
                    PQ.poll();
                }
            }
            double[] topEight = new double[8];
            for (int j = 0; j < 8; j++) {
                topEight[j] = PQ.poll();
            }
            for (double vals : topEight) {
                System.out.print(vals + " ");
            }
            return topEight;
        }
        return inputArray;
    }

}
