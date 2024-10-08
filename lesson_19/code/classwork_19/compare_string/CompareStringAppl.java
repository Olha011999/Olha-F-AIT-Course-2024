package classwork_19.compare_string;
//равенство строк - как понять?



public class CompareStringAppl {

    public static void main(String[] args) {

        int x = 5;//steak,  примитивные данные хранятся в стеке
        int y = 5;//steak

        boolean checker = (x == y);
        System.out.println(checker);//true

        String str1 = "Europe";//str1-стек=> (ссылка, link) Europe - heap
        String str2 = "Europe";//str2- стек=> (ссылка, link) Europe - heap

        System.out.println("--------------------");
        checker = (str1 == str2);//compare strings (сравнить строки)
        System.out.println(checker);

        System.out.println("--------------------");
        String str3 = new String ("Europe");// create new object
        checker = (str1 == str3);
        System.out.println(checker);//false, because (new) links not eguals!(равно)

        System.out.println("-------------------------");
        checker = str1.equals(str3);//compare Strings with equals
        System.out.println(checker);





    }
}
