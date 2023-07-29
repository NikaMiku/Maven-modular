package ru.netology;

import java.util.UUID;

public class MyService {

    private DbSetting dbSetting = new DbSetting("name", "password");
    private String name = "meService";
    private Db db = new Db(dbSetting);

    public String getName() {
        return name;
    }

    public MyEntry setMyEntry(MyEntry myEntry){
        myEntry.setId(UUID.randomUUID());
        db.setMyEntry(myEntry);
        return myEntry;
    }

    public MyEntry getMyEntry() {
        return db.getMyEntry();
    }
}
