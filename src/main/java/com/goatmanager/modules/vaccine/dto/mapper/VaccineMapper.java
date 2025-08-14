package com.goatmanager.modules.vaccine.dto.mapper;

import com.goatmanager.modules.vaccine.dto.requestdto.VaccineInfoRequestDto;
import com.goatmanager.modules.vaccine.dto.requestdto.VaccineRequestDto;
import com.goatmanager.modules.vaccine.entity.Vaccine;
import com.goatmanager.modules.vaccine.entity.VaccineInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VaccineMapper
{
    //vaccine
    VaccineRequestDto toVaccineRequestDto(Vaccine vaccine);
    Vaccine toVaccine(VaccineRequestDto vaccineRequestDto);
    //info
    VaccineInfoRequestDto toVaccineInfoRequestDto(Vaccine vaccine);
    VaccineInfo toVaccineInfo(VaccineInfoRequestDto vaccineInfoRequestDto);
}
