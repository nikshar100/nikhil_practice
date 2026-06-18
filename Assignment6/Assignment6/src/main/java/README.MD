Assignment 5:
Write a program to perform statistical analysis of scores for a class of students.The class may have up to 40
students.There are five quizzes during the term. Each student is identified by a four-digit student ID number.

Test output:

/Library/Java/JavaVirtualMachines/temurin-25.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=62186 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/nikhil.sharma/Desktop/kickups/Assignment5/Assignment5/out/production/Assignment5 driver.Driver
StudentID: 1234
Scores: [52, 7, 100, 78, 34]
StudentID: 2134
Scores: [90, 36, 90, 77, 30]
StudentID: 3124
Scores: [100, 45, 20, 90, 70]
StudentID: 4532
Scores: [11, 17, 81, 32, 77]
StudentID: 5678
Scores: [20, 12, 45, 78, 34]
StudentID: 6134
Scores: [34, 80, 55, 78, 45]
StudentID: 7874
Scores: [60, 100, 56, 78, 78]
StudentID: 8026
Scores: [70, 10, 66, 78, 56]
StudentID: 9893
Scores: [34, 9, 77, 78, 20]
StudentID: 1947
Scores: [45, 40, 88, 78, 55]
StudentID: 2877
Scores: [55, 50, 99, 78, 80]
StudentID: 3189
Scores: [22, 70, 100, 78, 77]
StudentID: 4602
Scores: [89, 50, 91, 78, 60]
StudentID: 5405
Scores: [11, 11, 0, 78, 10]
StudentID: 6999
Scores: [0, 98, 89, 78, 20]

Low Scores: [0, 7, 0, 32, 10]
High Scores: [100, 100, 100, 90, 80]
Average Scores: [46.2, 42.333332, 70.46667, 75.666664, 49.733334]

Process finished with exit code 0


Design:

```
+---------------------+          +------------------------+          +------------------+
|      Student        |          |      Statistics         |          |       Util       |
+---------------------+          +------------------------+          +------------------+
| - studentID: int    |          | - highscores: int[5]   |          | - fname: String  |
| - scores: int[5]    |          | - lowscores: int[5]    |          +------------------+
+---------------------+          | - avgScores: float[5]  |          | + Util(String)   |
| + Student()         |          +------------------------+          | + readFile(      |
| + Student(int,int[])|          | + findLow(Student[])   |          |   String,        |
| + getStudentID()    |          | + findHigh(Student[])  |          |   Student[])     |
| + setStudentID(int) |          | + findAverage(Student[])|         +------------------+
| + getScores()       |          | + print(int): String   |
| + setScores(int[])  |          +------------------------+
| + toString()        |
+---------------------+
                                          |
                                          | usedd by
                                          v
                                 +---------------------+
                                 |      Driver         |
                                 +---------------------+
                                 | + main(String[])    |
                                 +---------------------+
                                 | creates Student[]   |
                                 | uses Util           |
                                 | uses Statistics     |
                                 +---------------------+
```


