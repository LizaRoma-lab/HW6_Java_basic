package guru.qa;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = (2 + 2) * 2;
        int b = (6 - 3) / (9 - 6);
        System.out.println(a);
        System.out.println(b);

        //применить несколько арифметических операций над int и double в одном выражении
        double c = 1.5;
        int d =2;
        System.out.println(c * d + d/c);

        //применить несколько логических операций ( < , >, >=, <= )
        int min = 0;
        int max = 100;
        int temperature = 3;
        boolean isIce = (temperature < min);
        boolean isSteam = (temperature > max);
        System.out.println("Ice -" + isIce);
        System.out.println("Steam -" + isSteam);

        //прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        double x = 123.456, y = 2.5, z = 0.01; //В памяти он занимает 8 байт и может хранить значения в диапазоне -1.7*10^308 до +1.7*10^308

        //переполнение
        System.out.println((Double.MAX_VALUE + 0.1e-300) == Double.MAX_VALUE); // true
        System.out.println((Double.MAX_VALUE * 0.1e-300) == Double.MAX_VALUE); // false
        //При умножении обычно результат получается намного больше исходного, а при сложении - нет.
        // Тогда если к очень большому прибавлять что-то маленькое, то по логике архитекторов Java это вряд ли выйдет за границы,
        // а если умножить на что-то - может получиться результат, превышающий во много раз максимум.
    }

    }

