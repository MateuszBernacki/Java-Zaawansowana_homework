package interfaces;

import homework.task4.Rectangle;

public class InterfaceDemo {
    public static void main(String[] args) {
        Bank bank = new MyBank();
        System.out.println(bank.credit(100));        System.out.println(bank.debit(50));
        System.out.println("stan konta " + bank.balance());
        Report report = new Report("Zawartosc raportu");
        Printable[] reports = new Printable[2];
        reports[0] = (Printable) bank;
        reports[1] = report;
        for (Printable p :
                reports) {
            System.out.println(p.print("Printer HP"));
        }
    }
}
