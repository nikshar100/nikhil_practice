package model;

import java.util.Arrays;


public class Student {
    private int studentID;
    private int[] scores = new int[5];

    public Student() {}

    public Student(int studentID, int[] scores) {
        this.studentID = studentID;
        this.scores = scores;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
    @Override
    public String toString() {
        return ("StudentID: " + studentID +
                "\nScores: " + Arrays.toString(scores));
    }
}
