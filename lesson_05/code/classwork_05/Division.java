package classwork_05;
// Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.
public class Division {

    public static void main(String[] args) {
        int a=44;
        int b=65;

        boolean res=isDivided(a,b);
        System.out.println("a= "+a+ ", b= "+b+ " is devided: "+ res);
    }

    public static boolean isDivided (int a, int b){
        return a % b==0;
    }

}
