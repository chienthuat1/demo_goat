package com.goatmanager.modules.goats.service.impl;

import com.goatmanager.helper.GoatIdGenerator;
import com.goatmanager.helper.GoatNotFoudException;
import com.goatmanager.helper.Qr_Goats;
import com.goatmanager.modules.goats.dto.mapper.GoatMapper;
import com.goatmanager.modules.goats.dto.requestdto.GoatRequestDto;
import com.goatmanager.modules.goats.dto.responsedto.GoatResponseDto;
import com.goatmanager.modules.goats.entity.Goats;
import com.goatmanager.modules.goats.enum_.enum_goats;
import com.goatmanager.modules.goats.repository.GoatRepository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GoatService
{
    private final GoatRepository goatRepository;
    private final GoatMapper goatMapper;
    private final Qr_Goats qr_Goats;

    public GoatService(GoatRepository goatRepository, GoatMapper goatMapper, Qr_Goats qrGoats) {
        this.goatRepository = goatRepository;
        this.goatMapper = goatMapper;
        qr_Goats = qrGoats;

    }
    //Check Goat
    public boolean checkGoat(Long id) {
        return goatRepository.findById(Objects.requireNonNullElse(id, 0L)).isPresent();
    }

    //Status active
    public List<GoatResponseDto> getGoatsStatusAndActive(enum_goats status, Boolean active) {
        return goatRepository.findGoatsByStatusAndActiveOptional(status, active)
                .stream()
                .map(goatMapper::toGoatResponseDto)
                .collect(Collectors.toList());
    }

    //find id
    public Optional<GoatResponseDto> getGoatById(Long id) {
        Optional<Goats> goats = goatRepository.findById(id);

        return goats.map(goatMapper::toGoatResponseDto);
    }

    //Add Goat
    public Goats getAddGoat(GoatRequestDto goatRequestDto) {
        if (checkGoat(goatRequestDto.getId_goat())) {
            throw new RuntimeException("Too Fast");
        }else {
            Goats goats =goatMapper.toGoats(goatRequestDto);
            goats.setId_goat(GoatIdGenerator.generate());
            goats.setQr_code("Chưacó");
            goats.setImg_url("chưacó");
            goats.setBirthday(goatRequestDto.getBirthday() != null ? goatRequestDto.getBirthday() : LocalDate.now());
            goats.setStatus(enum_goats.Live);
            goats.setCreated_at(LocalDateTime.now());
            goats.setUpdated_at(LocalDateTime.now());
            return goatRepository.save(goats);
        }
    }
    public void getUpdateGoat(Long Id_goat,boolean update) {
        goatRepository
                .findById(Id_goat)
                .map(goat -> {
                    goat.setActive(update);
                    return goatRepository.save(goat);
                }).orElseThrow(() ->  new GoatNotFoudException("Goat Not Found"));
    }

    public byte[] generateGoatQr(Long id){
        Goats goats = goatRepository.findById(id).orElseThrow(
                () -> new GoatNotFoudException("Goat Not Found")
        );
        String url = "https://demo-goat.onrender.com/index/info-goats?id="+goats.getId_goat();
        byte[] qrimg = qr_Goats.generateQrCode(url,200,200);
        return qrimg;
    }

}
