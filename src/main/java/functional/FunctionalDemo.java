package functional;

import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
interface FunctionWithWithTwoOperations{
    double operator(double a, double b);
}
//a+b -> wynik
//a-b -> wynik
//a*b -> wynik
//a/b -> wynik
class Addition implements FunctionWithWithTwoOperations{

    @Override
    public double operator(double a, double b) {
        return a+b;
    }
}

public class FunctionalDemo {
    public static void main(String[] args) {
        FunctionWithWithTwoOperations add = new Addition();
        FunctionWithWithTwoOperations diff = new FunctionWithWithTwoOperations() {
            @Override
            public double operator(double a, double b) {
                return calc(a,b);

            }
            private double calc( double a, double b){
                return a*b;
            }

            @Override
            public String toString() {
                return "Funkcja mnożenia";
            }
        };
        List<FunctionWithWithTwoOperations>commands = new ArrayList<>();
        commands.add(add);
        commands.add(diff);
        //wyrażenie lambda: (a,b) ->a*b
        commands.add((a,b) ->a*b);
        //równoważnik lambdy w postaci klasy anonimowej
        //podnoszenie do potegi rozbudowana lambda

        final int[] c = new int []{10};
        commands.add((a,b)->{
            c[0]= 12;
           double result = Math.pow(a,b);
           return result;
           //lambda nie ma this.- wskazuje na obiekt w ktorym definjujemy lambde
        });
        for (FunctionWithWithTwoOperations f : commands) {
            System.out.println(f.operator(20,4));
        }
    }
}
