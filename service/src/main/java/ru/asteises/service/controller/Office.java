package ru.asteises.service.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

import java.util.List;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class Office {

    private long id;

    private String address;

    private String department;

    private List<Human> humans;
}
