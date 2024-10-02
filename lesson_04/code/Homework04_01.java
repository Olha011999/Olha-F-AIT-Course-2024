public class Homework04_01 {

    public static void main(String[] args) {
        //Exchange Euro to US Dollars
        double euro = 100;
        double dollar = exchengeDollar(euro);
        System.out.println(+euro+ " Dollar= " +dollar + " Euro");

        //Exchange Euro to British Pounds

        double britishpound= exchengeBritishPound(euro);
        System.out.println(+euro+ " British Pounds= " + britishpound+ " Euro");

        //Exchange Euro to Chinese Yuan
        double chineseyuan= chineseYuan (euro);
        System.out.println(+euro+ " Chinese Yuan= "+chineseyuan+ " Euro");

        // Degrees Celsius to degrees Fahrenheit
        double celsius= 50;
        double fahrenheit= fahrenheitDegrees(celsius);
        System.out.println(+celsius+ " Celsius degrees = "+fahrenheit+ " degrees Fahrenheit");

        //converts nautical miles to kilometers

        double kilometers = 100;
        double nauticalmiles = nauticalMiles (kilometers);
        System.out.println(+ kilometers+ " kilometers is " + nauticalmiles + " nautical miles");

    }//end of maim\

    //Method for Exchange Euro to US Dollars
    public static double exchengeDollar(double euru) {
        double change = 1.10;
        return  euru* change;
    }

    //Method Euro to British Pounds
    public static double exchengeBritishPound(double euro){
        double britishpound= 0.84;
        return euro * 0.84;
    }

    //Method Euro to Chinese Yuan
 public static double chineseYuan(double euro){
        double chineseyuan = 7.86;
        return euro * 7.86;
 }

 //Method Degrees Celsius to degrees Fahrenheit
    public static double fahrenheitDegrees(double celsius){
        double fahrenheit= celsius * 1.8000 + 32.00;
        return fahrenheit;
    }

    // Method converts nautical miles to kilometers
    public static double nauticalMiles (double kilometers){
        double nauticalmiles = 1852*kilometers;
        return nauticalmiles;
    }

}//end of class
