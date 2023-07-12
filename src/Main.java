public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Task 1");
        int contribution = 15000;
        int goal = 2_459_000;
        int total = 0;
        int i = 0;
        while (total < goal) {
//             total = total + contribution;
            total += contribution;
            System.out.println("Месяц " + i++ + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (int k = 10; k >= 1; k--)
            System.out.print(k + " ");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");
        int currentPopulation = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int populationDifference = birthRate - mortality;

        for (int i = 0; i <= 10; i++) {
            currentPopulation += currentPopulation / 1000 * populationDifference;
            System.out.println("Год " + i + " численность населения составляет " + currentPopulation);
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        double sum = 15_000;
        int month = 1;
        while (sum < 12_000_000) {
            sum = sum * 1.07;
            month++;
            System.out.println(month + " месяц " + "сумма накоплений равна " + sum);
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        double sum = 15_000;
        int month = 1;
        while (sum < 12_000_000) {
            sum = sum * 1.07;
            if (month % 6 == 0) {
                System.out.println(month);
                System.out.println(sum);
            }
            month++;
        }
    }

    public static void task6() {
        System.out.println("Task 6");
        double sum = 15_000;
        int time = 108;
        int month = 1;
        while (month <= time) {
            sum = sum * 1.07;
            if (month % 6 == 0) {
                System.out.println(month);
                System.out.println(sum);
            }
            month++;
        }
    }

    public static void task7() {
        System.out.println("Task 7");
        int friday = 7;
        int daysInMonth = 31;
        while (friday <= daysInMonth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println("Task 8");
        int currentYear = 2023;
        int frequency = 79;
       int beforeYear = currentYear - 200;
       int afterYear = currentYear +100;
       for (int year = 0; year < afterYear; year += 79) {
           if (year > beforeYear){
               System.out.println(year);
           }
       }
        }
}