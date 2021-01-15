package model;

public class Client {
    public static void main(String[] args) {
        XMLstorage xmLstorage=new XMLstorage();
        MySQLStorage mySQLStorage=new MySQLStorage();
        UserController client=new UserController();
        client.setStorage(xmLstorage);
        client.save("user");
        client.setStorage(mySQLStorage);
        client.save("my file");
    }
}
