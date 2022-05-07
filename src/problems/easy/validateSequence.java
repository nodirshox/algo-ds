package src.problems.easy;

public class validateSequence {
    public static void main(String[] args) {
        System.out.println("Sorted Squared Array");
        int[] input21 = { 5, 1, 22, 25, 6, -1, 8, 10 };
        int[] input22 = { 1, 6, -1, 10 };
        System.out.println(validateSubsequence(input21, input22) == true);
    }

    public static boolean validateSubsequence(int[] array, int[] sequence) {
        int location = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == sequence[location]) {
                location++;
            }
        }
        if (location == sequence.length) {
            return true;
        }
        return false;
    }
}
