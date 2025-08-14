package com.goatmanager.modules.goats.dto.mapper;


import com.goatmanager.modules.goats.dto.requestdto.GoatRequestDto;
import com.goatmanager.modules.goats.dto.responsedto.GoatResponseDto;
import com.goatmanager.modules.goats.entity.Goats;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = false))
public interface GoatMapper {
    GoatRequestDto toGoatRequestDto(Goats goats);
    Goats toGoats(GoatRequestDto GoatRequestDto);
    GoatResponseDto toGoatResponseDto(Goats goats);
    Goats toGoats(GoatResponseDto GoatResponseDto);
}
