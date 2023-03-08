public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1");
        int contribution = 15000;
        int total = 0;
        int i = 0;
        while ( total < 2_459_000 ) {
            total = total + contribution;
            System.out.println("Месяц " + i++ + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Task 2");
        int i = 1;
        while ( i <= 10 ) {
            System.out.print(i++ +" ");
        }
        System.out.println();
        for (int k = 10 ; k >= 1; k--)
            System.out.print(k + " ");
        System.out.println();
    }
    public static void task3() {
        System.out.println("Task 3");
        int currentPopulation = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int populationDifference = birthRate - mortality;

        for (int i = 0; i <= 10; i++ ) {
           currentPopulation+= currentPopulation / 1000 * populationDifference;
            System.out.println("Год " + i + " численность населения составляет " + currentPopulation);
        }
    }
}