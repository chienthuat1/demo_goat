package com.goatmanager.modules.goats.dto.requestdto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.goatmanager.modules.goats.enum_.enum_goats;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
    public class GoatRequestDto {
        private Long id_goat;
        @NotNull(message = "Giới Tính không được để trống")
        private boolean gender;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private LocalDate birthday;
        private enum_goats status;
        @Min(value = 1, message = "Cân nặng phải lớn hơn 0")
        private int weight;
        private String qr_code;
        private String img_url;
        private String description;
    }
