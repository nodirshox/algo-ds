package src.problems.crackingCodingInterview;

public class URLify {
    public static char[] convert(char[] str, int trueLength) {
        int emptySpaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                emptySpaces++;
            }
        }

        int index = trueLength + 2 * emptySpaces;
        if (trueLength == str.length) str[trueLength] = '\0'; // End array

        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        char[] input = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
        System.out.println(URLify.convert(input, 13));
    }
}
