import java.util.Locale;

public class FirstLesson {
    public static void main(String[] args) {
        //Создание строкми:
        String s = "String";
        //immutable class
        //Сложение строк
        String day = "Day";
        String and = "and";
        String night = "Night";

//        String dayAndNight = day + " " + and + " " + night;
        String dayAndNight = day.concat(" ").concat(and).concat(" ").concat(night);

        //Сравнение строк
        String x = "Test String";
        System.out.println("test string".equalsIgnoreCase(x));

        //Перевод примитива в строку String.valueOf();
        String a = String.valueOf(1);
        String b = String.valueOf(1.1);
        String c = String.valueOf(121212L);
        String d = String.valueOf(true);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        //Перевод строки в число
        int i = Integer.parseInt("25");
        Double aDouble = Double.parseDouble("2.5");

        System.out.println(i);
        System.out.println(aDouble);
        //Определение позиции элемента в строке
        String s1 = " New String";
        System.out.println(s1.indexOf("N"));

        //Извлечение подстроки из строки
        String s2 = "fffffffaaaaaa";
        String s3 = s2.substring(7,10);
        System.out.println(s3);


        String s4 = "SsssSSSSsss";
        String s5 = s4.toLowerCase();
        String s6 = s5.toUpperCase();
        System.out.println(s5);
        System.out.println(s6);




    }
}
