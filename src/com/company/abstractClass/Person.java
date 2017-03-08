package com.company.abstractClass;

/**
 * Created by Administrator on 2017/3/8.
 */
public abstract class Person {
    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    private String name;
}
