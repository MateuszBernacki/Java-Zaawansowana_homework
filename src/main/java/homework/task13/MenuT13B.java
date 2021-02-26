package homework.task13;

package homework.task13;

import java.util.Scanner;

public class MenuT13B {
    static Scanner scanner = new Scanner(System.in);
    static int vat1;
    static int vat2;

    public static void main(String[] args) {
        MenuItem nextPage = new MenuItem("Next page.", 1);
        MenuItem previousPage = new MenuItem("Previous page.", 2);
        MenuItem loadPage = new MenuItem("Load page number.", 3);
        MenuItem endItem = new MenuItem("Koniec", 0);

        Callback loadnextPage = new Callback() {
            @Override
            public void action() {

            }
        };
    }
}
