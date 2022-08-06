import java.util.*;

class MyClass {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();
        String address = kb.nextLine();
        String gender = kb.nextLine();
        Person person = new Person(name, address, gender);
        String vowelsOut = person.countVowels();
        String digitsOut = person.countDigits();
        System.out.println(vowelsOut);
        System.out.println(digitsOut);
    }
}

class Person {
    String Name;
    String Address;
    String Gender;

    Person(String name, String address, String gender) {
        this.Name = name;
        this.Address = address;
        this.Gender = gender;
    }

    public String countVowels() {
        int count = 0;
        for (int i = 0; i < Name.length(); i++) {
            if (Name.charAt(i) == 'a' || Name.charAt(i) == 'e' || Name.charAt(i) == 'i' || Name.charAt(i) == 'o'
                    || Name.charAt(i) == 'u') {
                count++;
            }
        }
        String out = "Count Of Vowels in Name = " + count;
        return out;
    }

    public String countDigits() {
        int count = 0;
        String out = "";
        for (int i = 0; i < Address.length(); i++) {
            if (Address.charAt(i) >= '0' && Address.charAt(i) <= '9') {
                count++;
            }
        }
        return out;
    }
}