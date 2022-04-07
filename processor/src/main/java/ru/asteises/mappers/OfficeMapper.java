package ru.asteises.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.asteises.dto.OfficeDTO;
import ru.asteises.entity.Office;
import ru.asteises.service.HumanService;

@Service
public class OfficeMapper {
    private HumanService humanService;

    public OfficeMapper(HumanService humanService) {
        this.humanService = humanService;
    }

    public Office officeDTOtoOffice(OfficeDTO officeDTO) {
        Office office = new Office();
        office.setAddress(officeDTO.getAddress());
        office.setDepartment(officeDTO.getDepartment());
        office.setHumans(humanService.getHumansByIds(officeDTO.getHumansId()));
        return office;
    }
}
