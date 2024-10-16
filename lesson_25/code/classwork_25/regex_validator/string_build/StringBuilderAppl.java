package classwork_25.regex_validator.string_build;

public class StringBuilderAppl {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Java");
        System.out.println(stringBuilder);

        stringBuilder.append("_").append("21");//можем сколько угодно добавлять аппенд и оно будет добавлять данные к основному стрингбилдеру
        System.out.println(stringBuilder);

        stringBuilder.reverse();//разворот, перачает все задом на перед
        System.out.println(stringBuilder);

        StringBuilder stringBuilderNew = new StringBuilder("Hallo");
        stringBuilderNew.insert(4,"!");//указать на какое именно место вставить, но если выйдем за пределы массива будет ошибка
        System.out.println(stringBuilderNew);
        stringBuilderNew.append(true);
        System.out.println(stringBuilderNew);


    }



}
