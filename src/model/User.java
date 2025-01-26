package model;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String area;

    public User(String name, String area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public String toString(){
        return "nothing";
    }
}
