package com.goatmanager.modules.vaccine.service.impl;


import com.goatmanager.modules.vaccine.repository.VaccineInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class VaccineInfoService {
    private final VaccineInfoRepository vaccineInfoRepository;

    public VaccineInfoService(VaccineInfoRepository vaccineInfoRepository) {
        this.vaccineInfoRepository = vaccineInfoRepository;
    }


}
