package org.example;
import java.util.logging.*;

public class Basiccreditcard implements Cloneable {
    String name;
    long creditcardNumber;
    String expirationDate;

    public Basiccreditcard(String name, long creditcardNumber, String expirationDate) {
        this.name = name;
        this.creditcardNumber = creditcardNumber;
        this.expirationDate = expirationDate;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String equally(Basiccreditcard s) {
        if (creditcardNumber == s.creditcardNumber) {
            return "true";
        }
        return "false";
    }

    public void compare(long credit) {
        Logger l = Logger.getLogger("com.api.jar");
        if (creditcardNumber == credit) {
            l.info("Both are same");
        } else {
            l.info("Both are not same");
        }
    }
}