package homework_34.time.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateOperation {
    //  Этот метод принимает дату рождения в виде стринга,
    //  и возвращающий возраст.

    public static int getAge(String birthDate) {

        // We define the format in which dates can be passed to us
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("[dd//MM//yyyy][yyyy-MM-dd]");

        // Convert the date of birth string to a LocalDate object
        LocalDate birth = LocalDate.parse(birthDate, dateTimeFormatter);

        // Calculate the difference between today's date and the date of birth to get the age
        return Period.between(birth, LocalDate.now()).getYears();
    }

    public static String[] sortStringDates(String[] dates) {
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy]");
        return Arrays.stream(dates).sorted((d1, d2)-> LocalDate.parse(d1, dateTimeFormatter).compareTo(LocalDate.parse(d2, dateTimeFormatter))).toArray(String[]::new);


//        // Create a format for reading string dates
//       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy]");
//
//        // Loop through the array to convert each string to a LocalDate and store the result in a new array
//        LocalDate[] localDates = new LocalDate[dates.length];
//        for (int i = 0; i < dates.length; i++) {
//            localDates[i] = LocalDate.parse(dates[i], dateTimeFormatter);
//        }
//        // Sort the LocalDate array in ascending order
//        for (int i = 0; i < localDates.length - 1; i++) {
//            for (int j = i + 1; j < localDates.length; j++) {
//                if (localDates[i].isAfter(localDates[j])) {
//                    // Swap dates if current date is later than next date
//                    LocalDate temp = localDates[i];
//                    localDates[i] = localDates[j];
//                    localDates[j] = temp;
//                }
//            }
//        }
//        // Convert the LocalDate array back to a string array with the same formats
//        String[] sortedDates = new String[dates.length];
//        for (int i = 0; i < localDates.length; i++) {
//            sortedDates[i] = localDates[i].format(dateTimeFormatter);
//        }
//
//        return sortedDates;

//        // Format for reading dates in different formats
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy][MM-dd-yyyy][MM/dd/yyyy]");
//
//
//        // Convert an array of strings to an array of LocalDate
//        LocalDate[] localDates = new LocalDate[dates.length];
//        for (int i = 0; i < dates.length; i++) {
//            localDates[i] = LocalDate.parse(dates[i], dateTimeFormatter);
//        }
//
//        // Sorting the LocalDate array
//        for (int i = 0; i < localDates.length - 1; i++) {
//            for (int j = i + 1; j < localDates.length; j++) {
//                if (localDates[i].isAfter(localDates[j])) {
//                    //Swap values if current date is later than next date
//                    LocalDate temp = localDates[i];
//                    localDates[i] = localDates[j];
//                    localDates[j] = temp;
//                }
//            }
//        }
//
//        // Convert the LocalDate array back to a string array
//        String[] sortedDates = new String[dates.length];
//        for (int i = 0; i < localDates.length; i++) {
//            sortedDates[i] = localDates[i].format(dateTimeFormatter);
//        }
//
//        return sortedDates;
   }


}
