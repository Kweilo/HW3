public class Main {
    public static void main(String[] args) {
        byte cat = 127;
        int dog = 47;
        short frog = 69;
        long tail = 44;
        double cucumber = 4.7;
        float flower = 2.0f;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        System.out.println("Значение переменной dog с типом int равно " + dog);
        System.out.println("Значение переменной frog с типом short равно " + frog);
        System.out.println("Значение переменной tail с типом long равно " + tail);
        System.out.println("Значение переменной cucumber с типом double равно " + cucumber);
        System.out.println("Значение переменной flower с типом float равно " + flower);

        //Задание 2
        byte a = 67;
        int b = 27897;
        short c = 569;
        long d = 987678965549L;
        double i = 2.786;
        float j = 27.12f;
        short l = -159;

        //Задание 3

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short paper = 480;
        int sheets = paper / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");

        //Задание 4

        byte bottles = 16 / 2;
        int min20 = 20 * bottles;
        int day = 60 * 24 * bottles;
        int day3 = 3 * 24 * 60 * bottles;
        int month = 30 * 24 * 60 * bottles;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        System.out.println("За 1 день машина произвела " + day + " штук бутылок");
        System.out.println("За три дня машина произвела " + day3+ " штук бутылок");
        System.out.println("За месяц машина произвела " + month+ " штук бутылок");

        //Задание 5
        byte paintCan = 120;
        int classes = paintCan / (2 + 4);
        int whiteCan = classes * 2;
        int brownCan = classes * 4;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteCan + " банок белой краски и " + brownCan + " банок коричневой краски");

        //Задание 6
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int egg = 70 * 4;
        int breakfast = bananas + milk + iceCream + egg;
        System.out.println(breakfast + "g " + breakfast / 1000 + "kg ");

        //Задание 7
        int weight = 7000;
        int days1 = weight / 250;
        int days2 = weight / 500;
        int mid = (days1 + days2) / 2;
        System.out.println("Спортсмену понадобится " + days1 +" дней если он будет худеть по 250 гр. Спортсмену понадобится " + days2 + " дней если он будет худеть по 500 гр. Среднее количество составляет " + mid + " день");



        //Задание 8
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int moneyM = masha + masha * 10 / 100;
        int moneyD = denis + denis * 10 / 100;
        int moneyK = kris + kris * 10 / 100;
        int manyM = moneyM - masha;
        int manyD = moneyD - denis;
        int manyK = moneyK - kris;
        System.out.println("Маша теперь получает " + moneyM + " рублей. Годовой доход вырос на " + manyM + " рублей");
        System.out.println("Денис теперь получает " + moneyD + " рублей. Годовой доход вырос на " + manyD + " рублей");
        System.out.println("Кристина теперь получает " + moneyK + " рублей. Годовой доход вырос на " + manyK + " рублей");






    }
}