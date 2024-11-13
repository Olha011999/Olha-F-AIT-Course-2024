package homework_45;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompareFileAppl {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please enter file names");
            return;  // Останавливаем выполнение, если не указаны имена файлов
        }

        String str1 = args[0];
        String str2 = args[1];



        try (FileInputStream fstr1 = new FileInputStream(str1);
             FileInputStream fstr2 = new FileInputStream(str2)) {

            // Сравниваем длину файлов
            if (fstr1.available() != fstr2.available()) {
                System.out.println("Files differ in length");
                return;  // Длины файлов разные, поэтому дальше сравнивать не нужно
            }

            // Сравниваем содержимое файлов
            int bytefstr1;
            int bytefstr2;
            while ((bytefstr1 = fstr1.read()) != -1 && (bytefstr2 = fstr2.read()) != -1) {
                if (bytefstr1 != bytefstr2) {
                    System.out.println("Files are different");
                    return;  // Байты не совпадают, файлы разные
                }
            }

            System.out.println("The files are the same");  // Если весь цикл завершился без различий, файлы одинаковые

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
