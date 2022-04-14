package ru.asteises.service;

import org.springframework.stereotype.Service;
import ru.asteises.mappers.OfficeMapper;
import ru.asteises.dto.OfficeDTO;
import ru.asteises.entity.Office;
import ru.asteises.repository.OfficeRepository;

@Service
public class OfficeService {
    private OfficeRepository officeRepository;
    private OfficeMapper officeMapper;

    public OfficeService(OfficeRepository officeRepository, OfficeMapper officeMapper) {
        this.officeRepository = officeRepository;
        this.officeMapper = officeMapper;
    }

    public Office setOffice(OfficeDTO officeDTO) {
        Office office = officeMapper.officeDTOtoOffice(officeDTO);
        officeRepository.save(office);
        return office;
    }
}
