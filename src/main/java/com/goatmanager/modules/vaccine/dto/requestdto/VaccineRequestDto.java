package com.goatmanager.modules.vaccine.dto.requestdto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter @Setter
public class VaccineRequestDto {
    private Long vaccine_id;
    private LocalDate date_vaccine;
    private String note;
}
