package de.telran.lesson9.practice;

public class LogicTask {

    public static void main(String[] args) {
        int a=1, b=2, c=3, d=0;
        // FALSE VERSION
        if((a < b) && (b == c)) { //1<2 && 2==3
            d = a + b + c;
            System.out.println("Сумма d = "+d);
        }
        else {
            System.out.println("Ложное значение!!!");
        }

//        TRUE VERSION
        if((a < b) || (b == c)) { //1<2 || 2==3
            d = a + b + c;
            System.out.println("Сумма d = "+d);
        }
        else {
            System.out.println("Ложное значение!!!");
        }


    }
}
