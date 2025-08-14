package com.goatmanager.modules.vaccine.service.impl;

import com.goatmanager.modules.vaccine.repository.VaccineRepository;
import org.springframework.stereotype.Service;

@Service
public class VaccineService {
    private final VaccineRepository vaccineRepository;

    public VaccineService(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }


}
