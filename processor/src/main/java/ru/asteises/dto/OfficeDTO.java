package ru.asteises.dto;

import lombok.Data;

import java.util.List;

@Data
public class OfficeDTO {
    private String address;
    private String department;
    private List<Long> humansId;
}
