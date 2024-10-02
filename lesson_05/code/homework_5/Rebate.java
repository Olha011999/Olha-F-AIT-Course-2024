package homework_5;

public class Rebate {

    //Сделайте расчет покупки товаров со скидками.
    // Товар А стоит X евро и на него скидка D%,
    // а товар B стоит Y евро и на него скидка С%.
    // Клиент взял N товаров A и M товаров B.
    // Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
    // Вычислите итоговую стоимость покупки и величину полученной скидки.
    public static void main(String[] args) {

        double priceA = 20; //цена товара
        int quantityA = 10;//количество товара
        double discountA = 6;// скидка на товар


        double totalPriceA = priceA * quantityA;
        double discountCoastForA = priceA * quantityA *(1- discountA / 100);


        double priceB = 50;//цена товара
        int quantityB = 6;//количество товара
        double discountB = 10;//скидка на товар

        double totalPriceB = priceB * quantityB;
        double discountCoastForB = priceB * quantityB * (1- discountB / 100);

        double totalPrice = totalPriceA + totalPriceB;
        double сoastWithDiscount = discountCoastForA + discountCoastForB;
        double discount = totalPrice - сoastWithDiscount;

        System.out.println("Total price without discont is: " + totalPrice+ " Euro");
        System.out.println("Total price with discont is: " + сoastWithDiscount+ " Eeuro");
        System.out.println("Total discont is: " + discount+ " Euro");


        if (сoastWithDiscount >= 100) {
            double res = сoastWithDiscount * 0.95;
            System.out.println("Total price with double discont is: "+res);
        }


    }
}



