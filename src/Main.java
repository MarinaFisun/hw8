public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Task 1");
        int contribution = 15000;
        int total = 0;
        int i = 0;
        while ( total < 2_459_000 ) {
            total = total + contribution;
            System.out.println("Месяц " + i++ + " сумма накоплений равна " + total + "рублей");
        }
    }
}