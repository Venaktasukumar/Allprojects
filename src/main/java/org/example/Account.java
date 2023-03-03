package org.example;
import java.util.logging.*;
class Account {
    Logger l = Logger.getLogger("com.api.jar");
    String accountholdersname;
    private final long accountnumber;
    private double balance;

    public Account(String name, long accnumber, long baalance) {
        accountholdersname = name;
        accountnumber = accnumber;
        balance = baalance;
    }

    public void deposit(long deposit) {
        l.info(accountholdersname);
        String la = "" + accountnumber;
        l.info(la);
        String lb = "Before Depositing balance:" + balance;
        l.info(lb);
        balance = balance + deposit;
        String lc = "After Depositing Balance:" + balance;
        l.info(lc);
    }

    public void withdrawal(long withdrwalamount) {
        l.info(accountholdersname);
        String ld = "" + accountnumber;
        l.info(ld);
        String le = "Before Withdrawal balance:" + balance;
        l.info(le);
        balance = balance - withdrwalamount;
        String lf = "After Withdrawal Balance:" + balance;
        l.info(lf);
    }

    public void accbalance() {
        l.info(accountholdersname);
        String lg = "" + accountnumber;
        l.info(lg);
        String lh = "Account Balance" + balance;
        l.info(lh);
    }

}

