package homework_17.bank_iban;

import homework_17.bank_iban.method.IbanCode;

public class IbanCodAppl {

    public static void main(String[] args) {

        IbanCode ibanCode1 =new IbanCode("4545454545778876544567");
        IbanCode ibanCode2 = new IbanCode("DE67656789076543213456");
        IbanCode ibanCode3 = new IbanCode("lk66666666666666666666666");

        ibanCode1.display();
        ibanCode2.display();
        ibanCode3.display();

    }
}
