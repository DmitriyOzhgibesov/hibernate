package ru.netology.hibernate.model;

import lombok.Builder;

import java.io.Serializable;
@Builder
public class Person implements Serializable {
    private String name;
    private String surname;
    private int age;
}
