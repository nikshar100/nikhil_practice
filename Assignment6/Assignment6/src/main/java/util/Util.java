package util;

import model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Util {

    private String fname;

    public Util(String fname) {
        this.fname = fname;
    }

    public void readFile(String filename, Student[] stu) {
        try {
            FileReader file = new FileReader(filename);
            BufferedReader buff = new BufferedReader(file);

            buff.readLine(); // skip header line

            int count = 0;
            String line;
            while ((line = buff.readLine()) != null && count < 40) {
                StringTokenizer st = new StringTokenizer(line);
                int id = Integer.parseInt(st.nextToken());
                int[] scores = new int[5];
                for (int i = 0; i < 5; i++) {
                    scores[i] = Integer.parseInt(st.nextToken());
                }
                stu[count] = new Student(id, scores);
                count++;
            }
            buff.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
