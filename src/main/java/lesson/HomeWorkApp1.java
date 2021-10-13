package lesson;

public class HomeWorkApp1 {
    public static void main(String[] args){
        printColor();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 1;
        int b =3;
        int c = a + b;
        if (c >= 0);{
            System.out.println("Сумма положительная");
        }
        if (c < 0){
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 2;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value >= 100) {
            System.out.println("Зелёный");
        }
        else {
            System.out.println("Жёлтый");
        }
    }
    public static void compareNumbers(){
        int a = 3;
        int b = 5;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
