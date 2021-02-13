package exceptions;

import java.time.LocalDate;

public class ExceptonExample {
    public static int avg(int ...arg){
        int sum = 0;
        for(int l: arg){
            sum += l;
        }
        return sum /arg.length;
    }

    public static double div(double a, double b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Dzielenie przez zero wynik typu nan");
        }
        return a/b;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try {
            System.out.println(avg());
        } catch (ArithmeticException e){
            System.out.println("Nie dziel przez zero, lista wartości pusta!!");
        }
        try {
            System.out.println(arr[4]);
            System.out.println(div(0.0, 0.0));
        } catch (ArithmeticException e ) {
            System.out.println("Wyjątek wyjscia poza zakres indexu: " + e.getMessage());
        }catch (IndexOutOfBoundsException e ) {
            System.out.println("Wyjątek wyjscia poza zakres: " + e.getMessage());
        }

    }
}

