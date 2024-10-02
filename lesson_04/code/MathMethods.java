public class MathMethods {

    public static void main(String[] args) {
        double money = 500; //dollars
        double euro = exchangeDollarsToEuro(money);
        System.out.println("Euro: " + euro);


        //количество съеденых каллорий
        double weight=200;// gramm
        double calorage= 50;// calorie on 100 gramm

        double energy= calculateCalorie(weight, calorage);
        System.out.println("Energy= " + energy);
    }

    private static double exchangeDollarsToEuro(double money){
        double rate = 0.9; //
        return money*rate;
    }

    private static double calculateCalorie(double weight, double calorage){
        return weight*calorage/100;
    }
}// end of class
