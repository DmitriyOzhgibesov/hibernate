package ru.netology.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Persons {
    @Id
    @Column(nullable = false)
    private String name;
    @Id
    @Column(nullable = false)
    private String surname;
    @Id
    @Column(nullable = false)
    private int age;
    @Column(length = 11)
    private String phone_number;
    @Column(nullable = false)
    private String city_of_living;

    @Override
    public String toString() {
        return String.format("{%s, %s, %d, %s, %s}",name, surname, age, phone_number, city_of_living);
    }
}