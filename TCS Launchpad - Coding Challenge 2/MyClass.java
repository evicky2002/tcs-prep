import java.util.*;

class MyClass {
    static LinkedHashMap<Character, Integer> countVowels(String input) {
        LinkedHashMap result = new LinkedHashMap<Character, Integer>();
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                if (!result.containsKey(input.charAt(i))) {
                    result.put(input.charAt(i), 1);
                } else {
                    int temp = (int) result.get(input.charAt(i)) + 1;
                    result.put(input.charAt(i), temp);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedHashMap eswr = countVowels("Good morning all");
        Set<Character> keys = eswr.keySet();
        System.out.print("{");
        int count = 1;
        for (Character key : keys) {

            System.out.print("\'" + key + "\'" + ":" + eswr.get(key));
            if (!(count == eswr.size())) {
                System.out.print(",");
            }
            count++;
        }
        System.out.print("}");

    }
}