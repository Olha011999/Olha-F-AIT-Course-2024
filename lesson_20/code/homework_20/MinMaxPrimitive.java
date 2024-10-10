package homework_20;
//Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main. Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.
public class MinMaxPrimitive {

    public static void main(String[] args) {

        if (args.length ==0){
            System.out.println("The type is wrong!");
        }

        for (int i = 0; i < args.length; i++) {
            String type = "null";
            switch (type){
                case "byte"->{
                    System.out.println("Byte min = " + Byte.MIN_VALUE + ", byte max = " + Byte.MAX_VALUE);
                }case "short"->{
                    System.out.println("Short min = " + Short.MIN_VALUE + ", short max = " + Short.MAX_VALUE);
                }
                case "char"->{
                    System.out.println("Char min = " + Character.MIN_VALUE + ", char max = " + Character.MAX_VALUE);
                }
                case "int"->{
                    System.out.println("Int min = " + Integer.MIN_VALUE + ", int max = " + Integer.MAX_VALUE);
                }
                case "long"->{
                    System.out.println("Long min = " + Long.MIN_VALUE + ", long max = " + Long.MAX_VALUE);
                }
                case "float"->{
                    System.out.println("Float min = " + Float.MIN_VALUE + ", float max = " + Float.MAX_VALUE);
                }
                case "double"->{
                    System.out.println("Double min = " + Double.MIN_VALUE + ", double max = " + Double.MAX_VALUE);
                }

            }

        }
    }
}
