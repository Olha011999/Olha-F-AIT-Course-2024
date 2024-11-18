package classwork_48.project_exchange.dao;

import classwork_48.project_exchange.model.Transaction;

import java.time.LocalDate;
import java.util.List;

public interface Operations {

    void mainMenu();
    Transaction addTrans(int num );
    boolean removeTrans(int num);
    Transaction findTrans(int num);
    List<Transaction> findTransByDate (LocalDate dateFrom, LocalDate dateTo);
    List<Transaction> findTransByType (boolean type);
    int quantity ();
    double calcRes (String name,  double amount, int operationType);
    double calcMarge (String name);
    void printTrans ();


}
