package model;

import java.util.Arrays;

public class Statistics {

    private int[] highscores = new int[5];
    private int[] lowscores = new int[5];
    private float[] avgScores = new float[5];

    public void findLow(Student[] a) {
        for (int quiz = 0; quiz < 5; quiz++) {
            int lowest = Integer.MAX_VALUE;
            for (int s = 0; s < a.length; s++) {
                if (a[s] == null) break;
                int score = a[s].getScores()[quiz];
                if (score < lowest) {
                    lowest = score;
                }
            }
            lowscores[quiz] = lowest;
        }
    }

    public void findHigh(Student[] a) {
        for (int quiz = 0; quiz < 5; quiz++) {
            int highest = 0;
            for (int s = 0; s < a.length; s++) {
                if (a[s] == null) break;
                int score = a[s].getScores()[quiz];
                if (score > highest) {
                    highest = score;
                }
            }
            highscores[quiz] = highest;
        }
    }

    public void findAverage(Student[] a) {
        for (int quiz = 0; quiz < 5; quiz++) {
            float sum = 0;
            int count = 0;
            for (int s = 0; s < a.length; s++) {
                if (a[s] == null) break;
                sum += a[s].getScores()[quiz];
                count++;
            }
            avgScores[quiz] = sum / count;
        }
    }

    public String print(int option) {
        if (option == 1) {
            return "Low Scores: " + Arrays.toString(lowscores);
        }
        if (option == 2) {
            return "High Scores: " + Arrays.toString(highscores);
        }
        if (option == 3) {
            return "Average Scores: " + Arrays.toString(avgScores);
        }
        if (option == 4) {
            return "Low Scores: " + Arrays.toString(lowscores) +
                    "\nHigh Scores: " + Arrays.toString(highscores) +
                    "\nAverage Scores: " + Arrays.toString(avgScores);
        }
        return null;
    }
}
