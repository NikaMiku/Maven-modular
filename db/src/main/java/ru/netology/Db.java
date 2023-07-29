package ru.netology;

import java.util.UUID;

public class Db {
    private DbSetting dbSetting;
    private MyEntry myEntry;

    public Db(DbSetting dbSetting) {
        this.dbSetting = dbSetting;
        myEntry = new MyEntry("first");
        myEntry.setId(UUID.randomUUID());
    }

    public DbSetting getDbSetting() {
        return dbSetting;
    }

    public MyEntry getMyEntry() {
        return myEntry;
    }

    public void setMyEntry(MyEntry myEntry) {
        this.myEntry = myEntry;
    }
}
