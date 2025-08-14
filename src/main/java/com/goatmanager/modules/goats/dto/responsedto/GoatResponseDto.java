package com.goatmanager.modules.goats.dto.responsedto;

import com.goatmanager.modules.goats.enum_.enum_goats;
import lombok.*;

import java.time.LocalDate;


@Builder
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoatResponseDto {
    private Long id_goat;
    private boolean gender;
    private LocalDate birthday;
    private enum_goats status;
    private int weight;
    private String qr_code;
    private String img_url;
    private String description;
    private boolean active;
}
