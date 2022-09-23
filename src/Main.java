public class Main {
    public static void main(String[] args) {

        /*ПЕРВОЕ ЗАДАНИЕ*/

        int integer1 = 1;
        byte byte1 = 1;
        short short1 = 1;
        long long1 = 1l;
        float float1 = 1f;
        double double1 = 1;

        System.out.printf("Значение переменной с типо integer1 равно %s", integer1);
        System.out.println();
        System.out.printf("Значение переменной с типо byte1 равно %s", byte1);
        System.out.println();
        System.out.printf("Значение переменной с типо short1 равно %s", short1);
        System.out.println();
        System.out.printf("Значение переменной с типо long1 равно %s", long1);
        System.out.println();
        System.out.printf("Значение переменной с типо float1 равно %s", float1);
        System.out.println();
        System.out.printf("Значение переменной с типо double1 равно %s", double1);
        System.out.println();


        /*ВТОРОЕ ЗАДАНИЕ */

        float float2 = 27.12f;
        long long2 = 987_678_965_549l;
        int integer2 = 2786;
        boolean boolean1 = false;
        short short2 = 569;
        int integer3 = -159;
        int integer4 = 27897;
        byte byte2 = 67;


        /*ТРЕТЬЕ ЗАДАНИЕ*/

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        System.out.printf("На каждого ученика рассчитано %s листов бумаги", 480/(lp + as + ea));
        System.out.println();
        System.out.println();


        /*ЧЕТВЁРТОЕ ЗАДАНИЕ*/

        int efficiencyForMin = 8;

        System.out.printf("За 20 минут машина произвела %s бутылок", efficiencyForMin * 20);
        System.out.println();
        System.out.printf("За сутки машина произвела %s бутылок", efficiencyForMin * 1440);
        System.out.println();
        System.out.printf("За 3 дня машина произвела %s бутылок", efficiencyForMin * (1440 * 3));
        System.out.println();
        System.out.printf("За месяц машина произвела %s бутылок", efficiencyForMin * (1440 * 31));
        System.out.println();
        System.out.println();


        /*ПЯТОЕ ЗАДАНИЕ*/

        int countClassroom = 8;
        System.out.printf("В школе, где %s классов, нужно %s  банок белой краски и %s банок коричневой краски", countClassroom, 2 * countClassroom, 4 * countClassroom);
        System.out.println();
        System.out.printf("Банок с коричневой краской %s, а банок с белой краской %s", 120 / 6 * 2, 120 / 6 * 4);
        System.out.println();
        System.out.println();



        /*ШЕСТОЕ ЗАДАНИЕ*/

        double bananas = 5;
        double milk = 2;
        double iceCream = 2;
        double egg = 4;
        System.out.println((bananas * 80 + milk * 105 + iceCream * 100 + egg * 70) / 1000);
        System.out.println();
        System.out.println();


        /*СЕДЬМОЕ ЗАДАНИЕ*/

        int a = (7 * 1000) / 250;
        int b = (7 * 1000) / 500;
        System.out.println(a + " дней понадобится, если каждый день сбрасывать по 250 грамм");
        System.out.println(b + " дней понадобится, если каждый день сбрасывать по 500 грамм");
        System.out.println();
        System.out.println();


        /*ВОСЬМОЕ ЗАДАНИЕ*/

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 76230;

        System.out.println("Маша теперь получает " + (mashaSalary + (mashaSalary * 0.10)) + " рублей. Годовой доход вырос на " + ((mashaSalary + (mashaSalary * 0.10)) * 12 - (mashaSalary * 12)));
        System.out.println();
        System.out.println();
    }
}