public class Main {
    public static void main(String[] args) {

        /*ПЕРВОЕ ЗАДАНИЕ*/


        var integer0 = 0;
        byte integer1 = 1;
        short integer2 = 2;
        int integer3 = 3;
        long integer4 = 4;
        float float5 = 5.1234567f;
        double float6 = 6.1234567890123456;
        boolean integer5 = true;
        char symbol1 = '!';
        System.out.println(integer0 + integer1 + integer2 + integer3 + integer4 + float5 + float6);
        System.out.println(integer5);
        System.out.println(symbol1);



        /*ВТОРОЕ ЗАДАНИЕ*/
        float first_boxer = 78.2f;
        float second_boxer = 82.7f;

        System.out.println("Общий вес" + (first_boxer + second_boxer));
        System.out.println("Разница между весами " + (second_boxer - first_boxer));



        /*ТРЕТЬЕ ЗАДАНИЕ*/

        float banana = 80f;
        float milk = 105f;
        float ice_cream = 100f;
        float egg = 70f;
        double kilogramms = (banana * 5 + milk * 2 + ice_cream * 2 + egg * 4) / 1000;

        System.out.println(kilogramms);



        /*ЧЕТВЁРТОЕ ЗАДАНИЕ*/

        int kol_dey_250 = (7 * 1000) / 250;
        int kol_dey_500 = (7 * 1000) / 500;

        System.out.println((kol_dey_500 + kol_dey_250) / 2);



        /*ПЯТОЕ ЗАДАНИЕ*/

        int salary_Masha = 67_760;
        int salary_Dima = 83_690;
        int salary_Cris = 76_230;

        System.out.println("Маша теперь получает " + (salary_Masha + ((salary_Masha / 100) * 10)) + " рублей. Годовой доход вырос на " + ((salary_Masha + ((salary_Masha / 100) * 10)) * 12) + " рублей.");
        System.out.println("Дима теперь получает " + (salary_Dima + ((salary_Dima / 100) * 10)) + " рублей. Годовой доход вырос на " + ((salary_Dima + ((salary_Dima / 100) * 10)) * 12) + " рублей.");
        System.out.println("Кристина теперь получает " + (salary_Cris + ((salary_Cris / 100) * 10)) + " рублей. Годовой доход вырос на " + ((salary_Cris + ((salary_Cris / 100) * 10)) * 12) + " рублей.");
    }
}