package com.goatmanager.modules.vaccine.dto.requestdto;

import com.goatmanager.modules.goats.dto.requestdto.GoatRequestDto;
import com.goatmanager.modules.goats.entity.Goats;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter@Setter
public class VaccineInfoRequestDto {
    @NotNull(message = "Tên không được để trống")
    private String vaccine_name;
    @NotNull(message = "Nhà Sản Xuất không được để trống")
    private String vaccine_manufacturer;
    @NotNull(message = "Mô Tả không được để trống")
    private String vaccine_description;
}
