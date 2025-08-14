package com.goatmanager.modules.vaccine.dto.responsedto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VaccineResponseDto {
    private int id_vaccine;
    @NotNull(message = "Tên Không Được Bỏ Trống")
    private String vaccine_name;
    @NotNull(message = "Nhà Sản Xuất không được để trống")
    private String vaccine_manufacturer;
    private String vaccine_description;
}
