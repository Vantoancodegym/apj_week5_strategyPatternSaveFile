package model;

public class MySQLStorage implements Storage{
    @Override
    public void store(String user) {
        System.out.println("saved "+user+" to My SQL file");
    }
}
