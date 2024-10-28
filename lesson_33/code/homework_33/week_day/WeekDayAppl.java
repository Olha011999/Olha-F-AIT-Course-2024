package homework_33.week_day;

import classwork_33.month.Month;
import classwork_33.season.Season;

public class WeekDayAppl {
    public static void main(String[] args) {

        System.out.println("--------values of Enum---------");
        //WeekDay.values();
        WeekDay[] weekDays = WeekDay.values();
        for (int i = 0; i < weekDays.length; i++) {
            //System.out.println(weekDays[i]);
            System.out.println(weekDays[i].getDay());
        }

        System.out.println("-------------to String----------");
        String d = WeekDay.MONDAY.toString();
        System.out.println(d);

        System.out.println("---------ordinal----------");
        int num = WeekDay.MONDAY.ordinal();
        System.out.println(num);

        System.out.println("-----valueOf()------------");
        WeekDay w =  WeekDay.FRIDAY.valueOf("FRIDAY");
        System.out.println(w);


        System.out.println("-------------------------");
        WeekDay dayOfWeek = WeekDay.MONDAY;
        System.out.println("Start month " + dayOfWeek);

        int numberPlus = 10;
        dayOfWeek = dayOfWeek.plusDays(numberPlus);
        System.out.println("After " + numberPlus +" days: " + dayOfWeek);




    }
}
