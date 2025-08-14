package com.goatmanager.modules.goats.dto.mapper;

import com.goatmanager.modules.goats.dto.requestdto.GoatRequestDto;
import com.goatmanager.modules.goats.dto.responsedto.GoatResponseDto;
import com.goatmanager.modules.goats.entity.Goats;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-15T01:06:57+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class GoatMapperImpl implements GoatMapper {

    @Override
    public GoatRequestDto toGoatRequestDto(Goats goats) {
        if ( goats == null ) {
            return null;
        }

        GoatRequestDto.GoatRequestDtoBuilder goatRequestDto = GoatRequestDto.builder();

        goatRequestDto.id_goat( goats.getId_goat() );
        goatRequestDto.gender( goats.isGender() );
        goatRequestDto.birthday( goats.getBirthday() );
        goatRequestDto.status( goats.getStatus() );
        goatRequestDto.weight( goats.getWeight() );
        goatRequestDto.qr_code( goats.getQr_code() );
        goatRequestDto.img_url( goats.getImg_url() );
        goatRequestDto.description( goats.getDescription() );

        return goatRequestDto.build();
    }

    @Override
    public Goats toGoats(GoatRequestDto GoatRequestDto) {
        if ( GoatRequestDto == null ) {
            return null;
        }

        Goats goats = new Goats();

        goats.setId_goat( GoatRequestDto.getId_goat() );
        goats.setGender( GoatRequestDto.isGender() );
        goats.setBirthday( GoatRequestDto.getBirthday() );
        goats.setStatus( GoatRequestDto.getStatus() );
        goats.setWeight( GoatRequestDto.getWeight() );
        goats.setQr_code( GoatRequestDto.getQr_code() );
        goats.setImg_url( GoatRequestDto.getImg_url() );
        goats.setDescription( GoatRequestDto.getDescription() );

        return goats;
    }

    @Override
    public GoatResponseDto toGoatResponseDto(Goats goats) {
        if ( goats == null ) {
            return null;
        }

        GoatResponseDto.GoatResponseDtoBuilder goatResponseDto = GoatResponseDto.builder();

        goatResponseDto.id_goat( goats.getId_goat() );
        goatResponseDto.gender( goats.isGender() );
        goatResponseDto.birthday( goats.getBirthday() );
        goatResponseDto.status( goats.getStatus() );
        goatResponseDto.weight( goats.getWeight() );
        goatResponseDto.qr_code( goats.getQr_code() );
        goatResponseDto.img_url( goats.getImg_url() );
        goatResponseDto.description( goats.getDescription() );
        goatResponseDto.active( goats.isActive() );

        return goatResponseDto.build();
    }

    @Override
    public Goats toGoats(GoatResponseDto GoatResponseDto) {
        if ( GoatResponseDto == null ) {
            return null;
        }

        Goats goats = new Goats();

        goats.setId_goat( GoatResponseDto.getId_goat() );
        goats.setGender( GoatResponseDto.isGender() );
        goats.setBirthday( GoatResponseDto.getBirthday() );
        goats.setStatus( GoatResponseDto.getStatus() );
        goats.setWeight( GoatResponseDto.getWeight() );
        goats.setQr_code( GoatResponseDto.getQr_code() );
        goats.setImg_url( GoatResponseDto.getImg_url() );
        goats.setDescription( GoatResponseDto.getDescription() );
        goats.setActive( GoatResponseDto.isActive() );

        return goats;
    }
}
