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
        scoreDifferential = Math.round((((score - courseRating) * 113 ) / slopeRating) * 10.0) / 10.0;
    }
}
