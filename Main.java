package com.company;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
       //Задача 1.
        int max = 2147483647;
        double pi = 3.14159;
        char symb ='Ы';
        boolean truth = true;
        byte getByte = 8;
        float usd = 61.24f;
        short num = 128;
        long num1 = 365L;
        String ball = "Adidas";
        //Задача 2.
        double boxerWeight1 = 78.20;
        double boxerWeight2 = 82.70;
        double sumBoxersWeight = boxerWeight1 + boxerWeight2;
        double diffsBoxersWeight = abs(boxerWeight1 - boxerWeight2);
        System.out.println("Вес двух боксеров = " + sumBoxersWeight);
        System.out.println("Разница Веса двух боксеров = " + diffsBoxersWeight);
        //Задача 3.
        int bananas = 5;
        int milk = 200;
        int plombir = 2;
        int egg = 4;
        double weightBananas = bananas * 80;
        double weightMilk = milk * 1.05;
        double weightPlombir = plombir * 100;
        double weightEgg = egg * 70;
        double weifghtTotalBreakfast = (weightBananas + weightMilk + weightPlombir + weightEgg) /1000;
        System.out.println( "Общий вес спорт-завтрака = " + weifghtTotalBreakfast + " кг." );
        //Задача 4.
        int lossWeight = 7;
        double daysLossWeifht1 = lossWeight/0.25;
        int resultdaysLossWeifht1 = (int)Math.round(daysLossWeifht1);
        System.out.println("Если терять 250 гр.де8нь, то понадобиться худеть "+  resultdaysLossWeifht1 + " дней.");
        double dayLsossWeifht2 = lossWeight/0.5;
        int resultdaysLossWeifht2 = (int)Math.round(dayLsossWeifht2);
        System.out.println("Если терять 500 гр.день, то понадобиться худеть " + resultdaysLossWeifht2 + " дней.");
        int AverageDaysLossWeight = (resultdaysLossWeifht2 + resultdaysLossWeifht1) / 2;
        System.out.println(AverageDaysLossWeight +" дней в среднем может потребоваться, чтобы добиться\n"
                + lossWeight +        " кг результата похудения.");
        //Задача 5.
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        int MashaNewSalary = MashaSalary + MashaSalary*10/100;
        int  DenisNewSalary = DenisSalary + DenisSalary*10/100;
        int KristinaNewSalary = KristinaSalary + KristinaSalary*10/100;
        int MashaProfit = (MashaNewSalary - MashaSalary) *12;
        int DenisProfit = (DenisNewSalary - DenisSalary) *12;
        int KristinaProfit = (KristinaNewSalary - KristinaSalary) *12;
        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей в месяц.\n" +
                "Машин Годовой доход вырос на " + MashaProfit + " рублей.");
        System.out.println("Денис теперь получает " + DenisNewSalary + " рублей в месяц.\n" +
                "Годовой доход Дениса вырос на " + DenisProfit + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaNewSalary + " рублей в месяц.\n" +
                "Годовой доход  Кристины вырос на " + KristinaProfit + " рублей.");

        //Задача 6. Повышенная сложность.
         int a = 12;
         int b =27;
         int c =44;
         int d = 15;
         int e = 9;
         int result = a * (b + (c - d * e));
        System.out.println("Результат =" + result);
        System.out.println("Инвертированный Результат =" + (result*(-1)));

     //Задача 7. Повышенная сложность.
        int a1 = 5;
        int b1 = 7;
        a1 = (b1 * a1)-b1-b1-b1-b1;
        --b1;
        --b1;
        System.out.println("Теперь a1 = " + a1 + " b1 = " + b1--);
        /*Задача 8. Повышенная сложность.
        Объявите переменную a и инициализируйте ее любым трехзначным числом.
                Объявите переменную b и, путем математических операций над a получите и
        присвойте переменной b цифру, которая находится в центре значения из
        переменной a.
        Например, если a = 256, то необходимо с помощью математических действий
        достать цифру 5 из центра и присвоить переменной b. Если a = 789, то b должна
        быть инициализирована числом 8, так как эта цифра является вторым из трех
                (центральным) символом в значении a.
        Следует учесть, что алгоритм должен быть универсальным и корректно
        срабатывать на любых трехзначных числах из a без изменений.
                Это значит, что рассчитать в голове сумму, которую необходимо вычесть или
        прибавить к a для корректного значения в b нельзя, так как при каждом изменении
        значения в a её нужно пересчитывать.*/
        int a2 =139;
        int b2 = (a2%100 - a2%10)/10;
        System.out.println("b2 = "+b2);

    }
}
