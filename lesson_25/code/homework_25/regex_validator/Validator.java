package homework_25.regex_validator;

public class Validator {
    // CreditCardNumber
    public static boolean checkCreditCardNumber(String str) {
        return str.matches("\\d{8,16}");
    }

    //DateFormatEU - dd-MM-yyyy(?)
    public static boolean checkDateFormatEU(String str) {
        // TODO Homework checkDateFormatEU
        return str.matches("^(0[1-9]|[12][0-9]|3[01])[./-](0[1-9]|1[0-2])[./-](\\d{4})$");

    }


    // DateFormatUS - yyyy-MM-dd
    public static boolean checkDateFormatUS(String str) {
        // TODO Homework checkDateFormatUS
        // Регулярное выражение для формата даты: YYYY-MM-DD, YYYY/MM/DD, YYYY.MM.DD
        String datePattern = "^(\\d{4})[./-](0[1-9]|1[0-2])[./-](0[1-9]|[12][0-9]|3[01])$";

        // Проверка на соответствие регулярному выражению
        if (!str.matches(datePattern)) {
            return false; // Если формат не совпадает, вернуть false
        }

        // Разделяем строку на компоненты
        String[] parts = str.split("[./-]"); // Разделяем по любому из разделяющих знаков

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // Проверка корректности дня в зависимости от месяца
        if (month == 2) { // Февраль
            if (isLeapYear(year)) {
                return day <= 29; // Високосный год
            } else {
                return day <= 28; // Обычный год
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) { // Апрель, Июнь, Сентябрь, Ноябрь
            return day <= 30; // 30 дней
        }

        return day <= 31; // Остальные месяцы имеют 31 день
    }

    // Метод для определения високосного года
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }



    // PhoneNumber
public static boolean checkPhoneNumber(String str) {
    // TODO Homework checkPhoneNumber
    return str.matches("^\\+08\\(0[1-9]\\)\\d{4}-\\d{4}$");
}

    // LessEquals255
public static boolean checkLessEquals255(String str) {
    // TODO Homework checkLessEquals255
    return  str.matches("^(25[0-5]|(2[0-4][0-9])|([01]?[0-9][0-9]?))$");
}
}





