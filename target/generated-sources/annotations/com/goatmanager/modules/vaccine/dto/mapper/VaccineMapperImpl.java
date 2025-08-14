package com.goatmanager.modules.vaccine.dto.mapper;

import com.goatmanager.modules.vaccine.dto.requestdto.VaccineInfoRequestDto;
import com.goatmanager.modules.vaccine.dto.requestdto.VaccineRequestDto;
import com.goatmanager.modules.vaccine.entity.Vaccine;
import com.goatmanager.modules.vaccine.entity.VaccineInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-15T01:06:56+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class VaccineMapperImpl implements VaccineMapper {

    @Override
    public VaccineRequestDto toVaccineRequestDto(Vaccine vaccine) {
        if ( vaccine == null ) {
            return null;
        }

        VaccineRequestDto.VaccineRequestDtoBuilder vaccineRequestDto = VaccineRequestDto.builder();

        return vaccineRequestDto.build();
    }

    @Override
    public Vaccine toVaccine(VaccineRequestDto vaccineRequestDto) {
        if ( vaccineRequestDto == null ) {
            return null;
        }

        Vaccine vaccine = new Vaccine();

        return vaccine;
    }

    @Override
    public VaccineInfoRequestDto toVaccineInfoRequestDto(Vaccine vaccine) {
        if ( vaccine == null ) {
            return null;
        }

        VaccineInfoRequestDto.VaccineInfoRequestDtoBuilder vaccineInfoRequestDto = VaccineInfoRequestDto.builder();

        vaccineInfoRequestDto.vaccine_name( vaccine.getVaccine_name() );
        vaccineInfoRequestDto.vaccine_manufacturer( vaccine.getVaccine_manufacturer() );
        vaccineInfoRequestDto.vaccine_description( vaccine.getVaccine_description() );

        return vaccineInfoRequestDto.build();
    }

    @Override
    public VaccineInfo toVaccineInfo(VaccineInfoRequestDto vaccineInfoRequestDto) {
        if ( vaccineInfoRequestDto == null ) {
            return null;
        }

        VaccineInfo vaccineInfo = new VaccineInfo();

        return vaccineInfo;
    }
}
