package classwork_34.time_api_exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {

    public static void main(String[] args) {

        //How much time? - ISO format: YYYY-mm-DD

        LocalDate ld = LocalDate.now();//LocalDate- объект, localDate or ld- поле класса
        System.out.println(ld);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("----------------");

        LocalDate gagarin = LocalDate.of(1961, 04, 12);
        System.out.println(gagarin);
        //какой это был день недели
        System.out.println(gagarin.getDayOfWeek());
        //какой это был день года
        System.out.println(gagarin.getDayOfYear());
        //...
        System.out.println("--------Is leap year?--------");
        int year = 2024;
        System.out.println("Is year " + year + " leap: " + Year.isLeap(year));
        System.out.println("----------------");
        System.out.println(gagarin.isBefore(ld));//true
        System.out.println(gagarin.isAfter(ld));//false
        System.out.println("----------------");
        //LocalDate days = LocalDate.ofEpochDay(ChronoUnit.DAYS.between(gagarin, ld));
        //System.out.println(days);

        long days = ChronoUnit.DAYS.between(gagarin, ld);
        System.out.println(days);//показывает сколько дней прошло от гагарин
        long period = ChronoUnit.YEARS.between(gagarin, ld);
        System.out.println(period);//показывает сколько лет прошло от гагарин, 63

        System.out.println("----------------");
        System.out.println("-------------DateTimeFormatter----------------");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;//YYYY-mm-DD
        String date = gagarin.format(dateTimeFormatter);//LocalDate to String
        System.out.println(date);

        //выбираем другой формат
        System.out.println("----------------");
        dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(dateTimeFormatter);
        System.out.println(date);

        //задаем другой, собственный формат строки с датой
        System.out.println("----------------");
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        date = gagarin.format(dateTimeFormatter);
        System.out.println(date);


        //задаем другой, собственный формат строки с датой
        System.out.println("----------------");
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMMM/yyy");//делаем разные форматы
        date = gagarin.format(dateTimeFormatter);
        System.out.println(date);

        //задаем locale
        System.out.println("----------------");
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyy", Locale.ITALIAN);//перевод даты на другой язык
        date = gagarin.format(dateTimeFormatter);
        System.out.println(date);

        //parsing LocalDate from String
//        System.out.println("/////////////////////");
//        String stringDate = "29:10:2024";
//        LocalDate result = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd:MM:yyy]"));
//        System.out.println(result);//ISO format

        System.out.println("/////////////////////");
        String stringDate = "01/12/2024";
        LocalDate result = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd:MM:yyy][dd/MM/yyyy][dd-MM-yyyy][dd:MM-yyyy]"));
        System.out.println(result);//ISO format

        System.out.println("---------------------------");
        String dianaBirthday = "23.06.1983";
        LocalDate dianaBirth = LocalDate.parse(dianaBirthday, DateTimeFormatter.ofPattern("[dd.MM.yyyy]"));
        System.out.println(dianaBirthday);

        dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRENCH);
        String di = dianaBirth.format(dateTimeFormatter);
        System.out.println(di);
    }
}
