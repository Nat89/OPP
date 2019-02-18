package model;

public class Main {
    public static void main(String[] args) {
//        // utworzenie obiektu klasy
//        Auto a1 = new Auto();
//        // Odwołanie do pól klasowych -> obiekt.pole lub metoda
//        System.out.println(a1);
//
//        //Zmiana pól klasowych
//        a1.brand = "BMW";
//        a1.model = "X5";
//        a1.year = 2010;
//        a1.color = "BLACK";
//        a1.fuel_type = "DIESEL";
//        a1.price = 80_000;
//        a1.segment = 'S';
//// utworzenie drugiego obiektu klasy
//        Auto a2 = new Auto();
//        System.out.println(a2);
//        a2.setPrice(100000);
//        System.out.println(a2);
//        System.out.println(a2.getPrice());
//        System.out.println(a2.getPriceWithTax(23));
 Auto a3 = new Auto ("VW", "Passat",2019, "black","diesel",100000, 'D') ;
            System.out.println(a3);
            Auto a4 = new Auto("Audi","A80",1990,"red", "benzyna",1200,'C') ;
        System.out.println(a4);
        }
    }
