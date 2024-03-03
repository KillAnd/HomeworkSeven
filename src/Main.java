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
        for (i=1; i<=10; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        i = 10;
        while (i>=1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

//        task 3
        int totalY = 12_000_000;
        int birtRate =17;
        int mortalityRate =8;
        for (i=1; i<=10; i++) {
            totalY = totalY + (totalY / 1000 * (birtRate - mortalityRate));
            System.out.println("Год " + i + ", численность населения составляет  " + totalY);
        }

        //task 4
        int balance = 0;
        int invest = 15000;
        i = 0;
        while (balance<=12_000_000) {
            System.out.println("Месяц " + i + " на вкладе " + balance);
            balance = balance + invest;
            balance = balance + balance*7/100;
            i++;
        }

        //task 5
        while (balance<=12_000_000) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " на вкладе " + balance);
            }
            balance = balance + invest;
            balance = balance + balance * 7 / 100;
            i++;
        }



    }
    }

