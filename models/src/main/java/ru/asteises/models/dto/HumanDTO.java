package ru.asteises.models.dto;

import lombok.Data;

@Data
public class HumanDTO {
    private String name;
    private String surname;
    private int age;
    private long professionId;
}
