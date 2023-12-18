package Handicaps;

import java.util.Scanner;

public class Round {
    int score;
    double courseRating;
    double slopeRating;
    double scoreDifferential;

    public Round() {
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        courseRating = scanner.nextDouble();
        slopeRating = scanner.nextDouble();
        scoreDifferential = ((score - courseRating) * 113 ) / slopeRating;
    }
}
