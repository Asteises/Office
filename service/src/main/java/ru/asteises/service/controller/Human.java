package ru.asteises.service.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Human {

    private long id;

    private String name;

    private String surname;


    private int age;

    private Profession profession;
}
