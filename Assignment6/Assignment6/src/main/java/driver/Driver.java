package driver;

import model.Student;
import model.Statistics;
import util.Util;

public class Driver {
    public static void main(String[] args) {
        Student[] lab2 = new Student[40];

        Util a1 = new Util("students.txt");
        a1.readFile("students.txt", lab2);

        // Print student data
        for (int i = 0; i < lab2.length; i++) {
            if (lab2[i] == null) break;
            System.out.println(lab2[i]);
        }

        System.out.println();

        Statistics stats = new Statistics();
        stats.findLow(lab2);
        stats.findHigh(lab2);
        stats.findAverage(lab2);
        System.out.println(stats.print(4));
    }
}
