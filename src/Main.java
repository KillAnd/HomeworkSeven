public class Main {
    public static void main(String[] args) {
//        task 1
        int salary = 15000, total = 0, i = 0;
        while (total <= 2_459_000) {
            if (i==0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + salary + " рублей.");
            }
            i++;
            total = salary + total;
            total = total + total/100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }

//        task 2

    }
}