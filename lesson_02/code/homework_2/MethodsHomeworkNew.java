package homework_2;

public class MethodsHomeworkNew {
    public static void main(String[] args) {
        method1();
}

public static void method1() {
    System.out.println("Method1 started");
    System.out.println("Method1 calls method2");

    method2();

    System.out.println("Method1 finished");

}

public static void method2() {
    System.out.println("Method2 started");
    System.out.println("Method2 calls method3");

    method3();

    System.out.println("Method2 finished");

}

public static void  method3() {
    System.out.println("Method3 started");
    System.out.println("Method3 finished");
   }
}