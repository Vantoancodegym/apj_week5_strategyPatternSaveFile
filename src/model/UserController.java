package model;

public class UserController {
    private Storage storage;

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void save(String user){
        storage.store(user);
    }
}
