package homework_17.bank_iban.method;

public class IbanCode {

    private String accountNumber;

    public IbanCode(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public int lengthCode() {
        return accountNumber.length();
    }

    public int controlCode() {
        char firstChar = accountNumber.charAt(0);
        char secondChar = accountNumber.charAt(1);
        int sum = (int) firstChar + (int) secondChar;

        return sum;
    }

    public  boolean isValid(){
        return  accountNumber.length() == 22;
    }

    public void display(){
        System.out.println("IBAN: "+accountNumber+ ", length: " + lengthCode()+ ", sum of first two ASCII: "+ controlCode()+ ", is valid: " +isValid());
    }
}

