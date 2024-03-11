public class Main {
    public static void main(String[] args) {

        //Задача 1

        byte a = 100;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 30000;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 2000000000;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 900000000;
        System.out.println("Значение переменной d с типом long равно " + d);
        float f = 12.2664f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double w = 43.435465;
        System.out.println("Значение переменной w с типом double равно " + w);

        //Задача 2

        float f1 = 27.12f;
        long d1 = 987678965;
        double w1 = 2.786;
        short b1 = 569;
        short b2 = -159;
        int c1 = 27897;
        byte a1 = 67;
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(w1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(c1);
        System.out.println(a1);

        //Задача 3

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short paper = 480;
        int answer = paper/(teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + answer + " листов бумаги.");

        //Задача 4

        byte bottles = 16;
        int minutes20 = 10;
        int day = 720;
        int day3 = 2160;
        int day30 = 21600;

       minutes20 = bottles * minutes20;
       day = day * bottles;
       day3 = day3 * bottles;
       day30= day30 * bottles;
       System.out.println("За 20 минут машина произвела " + minutes20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + day30 + " штук бутылок");

        //Задача 5

        byte totalCans = 120;
        byte perClass = 6;
        int totalClasses = totalCans / perClass;
        byte white = 2;
        byte brown = 4;
        int totalWhite = white * totalClasses;
        int totalBrown = brown * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно "
        + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");


        //Задача 6

        byte bananas = 5;
        byte bananaGram = 80;
        short milk = 2;
        byte milkGram = 105;
        byte ise = 2;
        byte iseGram = 100;
        byte eggs = 4;
        byte eggGram = 70;
        int bananasGrams = bananas * bananaGram;
        int milkGrams = milkGram * milk;
        int iseGrams = ise * iseGram;
        int eggsGrams = eggs * eggGram;
        float totalGrams = bananasGrams + milkGrams + iseGrams + eggsGrams;
        float totalKg = totalGrams / 1000;
        System.out.println("Вес такого спортзавтрака " + totalGrams + " грамм или "
        + totalKg + " кг.");

        //Задача 7

        short total = 7000;
        short gramsPerDay1 = 250;
        short gramsPerDay2 = 500;
        int option250 = total / gramsPerDay1;
        int option500 = total / gramsPerDay2;
        int onAverage = (option250 + option500) / 2;
        System.out.println("Если 250 грамм в день, то всего дней " + option250);
        System.out.println("Если 500 грамм в день, то всего дней " + option500);
        System.out.println("В среднем дней " + onAverage);

        //Задача 8

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int MashaInt = Masha + (Masha / 10);
        int DenisInt = Denis + (Denis / 10);
        int KristinaInt = Kristina + (Kristina / 10);
        int MashaYear = (Masha / 10) * 12;
        int DenisYear = (Denis / 10) * 12;
        int KristinaYear = (Kristina / 10) * 12;

        System.out.println("Маша теперь получает " + MashaInt +
                " рублей. Годовой доход вырос на " + MashaYear + " рублей.");
        System.out.println("Денис теперь получает " + DenisInt +
                " рублей. Годовой доход вырос на " + DenisYear + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaInt +
                " рублей. Годовой доход вырос на " + KristinaYear + " рублей.");


    }
}