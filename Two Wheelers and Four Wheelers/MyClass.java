import java.util.Scanner;

// V = Number of two wheelers + Number of four wheelers
// W = Total Number of wheels i.e. 4*No. of four wheelers + 2*No. of two wheelers
// Given v and w find tw and fw

public class MyClass {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int v = Integer.parseInt(kb.nextLine());
        int w = Integer.parseInt(kb.nextLine());
        int tw = ((4 * v) - w) / 2;
        int fw = v - tw;
        if (w < 2 || w <= v) {
            System.out.println("INVALID");
        }
        System.out.println("Number of two wheelers : " + tw);
        System.out.println("Number of four wheelers : " + fw);
    }
}
