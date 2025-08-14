package com.goatmanager.modules.vaccine.dto.responsedto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VaccineInfoResponse {
    private long id_history;
    private Long goat_id;
    private Long vaccine_id;
    private LocalDate date_vaccine;
    private String note;
}
