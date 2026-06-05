import java.util.Arrays;

public class insertion {
    public String insertionSort(int[] input) {
        for (int wall = 0; wall < input.length; wall++) {
            int setLowestInd = wall;
            int setLowest = input[wall];
            for (int loc = wall; loc < input.length; loc++) {
                if (input[loc] < setLowest) {
                    setLowestInd = loc;
                    setLowest = input[loc];

                }
            }
            int placeholder = input[wall];
            input[wall] = setLowest;
            input[setLowestInd] = placeholder;

        }
        return Arrays.toString(input);
    }

    public static void main(String[] args) {
        int[] test1 = {5, 13, 7, 99, 34, 9, 2, 7, 101, 8};
        System.out.println(insertionSort(test1));
    }
}
