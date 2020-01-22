package zadaci;

import zadaci.Kalkulator;

public class KalkulatorExecutor {

    public static void main(String[] args) {
        //KONSTRUKTOR NASLJEĐENI IZ OBJECTA
        Kalkulator kalkulator = new Kalkulator(20.00, 20.00);
        double result = kalkulator.add();
        result = kalkulator.sub();
        result = kalkulator.div();
        result = kalkulator.mul();
        
        System.out.println(kalkulator.add());
        System.out.println(kalkulator.sub());
        System.out.println(kalkulator.div());
        System.out.println(kalkulator.mul());
    }
}
