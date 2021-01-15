package model;

public class XMLstorage implements Storage{
    @Override
    public void store(String user) {
        System.out.println("saved "+user+" to XML file");

    }
}
