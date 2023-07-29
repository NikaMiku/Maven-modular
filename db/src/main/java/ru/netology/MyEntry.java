package ru.netology;

import java.util.UUID;

public class MyEntry {

    private UUID id;
    private String name;

    public MyEntry(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("MyEntry{").append("id=").append(id).append(", name='").append(name).append('\'').append('}').toString();
    }
}
