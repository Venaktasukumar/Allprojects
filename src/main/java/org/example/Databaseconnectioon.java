package org.example;
import java.util.logging.*;
class Databaseconnectioon {
    Logger l = Logger.getLogger("com.api.jar");
    static Databaseconnectioon st;
    String connection;

    private Databaseconnectioon(String connection) {
        this.connection = connection;
    }

    public static Databaseconnectioon getInstance(String connection) {
        if (st == null) {
            st = new Databaseconnectioon(connection);
        }
        return st;
    }

    public void connection(String s) {
        String k = s + " database Connection is established";
        l.info(k);
    }

    public void closeconnection() {
        l.info("connection is closed");
    }
}
