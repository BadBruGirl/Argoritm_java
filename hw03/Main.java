
package hw03;

public class Main {

    public static void main(String[] args) {
        List L = new List();
        for (int i = 3; i <= 7; i++)
            L.add(i);

        L.print();
        L.reversal();
        L.print();

    }
}