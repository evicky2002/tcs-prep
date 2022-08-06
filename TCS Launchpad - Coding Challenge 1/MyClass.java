import java.util.*;

class MyClass {
    public static void main(String[] args) {
        int output = 0;
        String sentence, word;
        Scanner kb = new Scanner(System.in);
        sentence = kb.nextLine();
        word = kb.nextLine();
        output = findFrequency(sentence, word);
        if (output == 0) {
            System.out.println("Word not found.");
        } else {
            System.out.println(output);
        }
    }

    public static int findFrequency(String sentence, String word) {
        int out = 0;
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].toLowerCase().equals(word.toLowerCase())) {
                out++;
            }
        }
        return out;
    }
}