package classwork_33.season;
//Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
//Опробовать на нем методы:
//.VALUES()- извлекает данные в массив
//.toString
//.ordinal()
//.valueOf()
public class SeasonAppl {
    public static void main(String[] args) {

        Season[] seasons = Season.values();
        //Season.values();

        System.out.println("--------values of Enum---------");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println( seasons[i]);
            System.out.println(seasons[i].getNumber()+ " : " + seasons[i].getName());
        }
        System.out.println("--------------------------------------");
        //for each, iter

        for (Season season : seasons) {
            System.out.println(season.getName());
            System.out.println(season.getDuration());

        }

        System.out.println("-------------to String----------");
        String str = Season.AUTUMN.toString();
        System.out.println(str);

        System.out.println("---------ordinal----------");
        int num = Season.AUTUMN.ordinal();
        System.out.println(num);// 3 or 4
        num = Season.WINTER.ordinal();
        System.out.println(num);// 0 or 1


        System.out.println("-----valueOf()------------");
       Season s =  Season.SPRING.valueOf("SPRING");
        System.out.println(s);

    }



}
