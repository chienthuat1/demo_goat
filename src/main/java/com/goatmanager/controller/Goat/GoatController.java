package com.goatmanager.controller.Goat;

import com.goatmanager.helper.Qr_Goats;
import com.goatmanager.modules.goats.dto.requestdto.GoatRequestDto;
import com.goatmanager.modules.goats.dto.responsedto.GoatResponseDto;
import com.goatmanager.modules.goats.entity.Goats;
import com.goatmanager.modules.goats.enum_.enum_goats;
import com.goatmanager.modules.goats.service.impl.GoatService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/goats")
public class GoatController {

    private final GoatService goatService;

    public GoatController(GoatService goatService, Qr_Goats qrGoats) {
        this.goatService = goatService;
    }

    @GetMapping("/{id}/qr")
    public ResponseEntity<byte[]> qr(@PathVariable Long id) {
        return ResponseEntity.ok(goatService.generateGoatQr(id));
    }


    @GetMapping("/all")
        public List<GoatResponseDto> getAllGoats(@RequestParam(required = false)enum_goats status ,@RequestParam(required = false) Boolean active) {
            return goatService.getGoatsStatusAndActive(status,active);
        }

    @GetMapping("/view/{id}")
        public ResponseEntity<Optional<GoatResponseDto>> getGoat(@PathVariable Long id) {
        return ResponseEntity.ok(goatService.getGoatById(id));
    }

    @PostMapping("/update/{id}/active")
    public ResponseEntity<?> update(@PathVariable Long id ,@RequestParam boolean update) {
        goatService.getUpdateGoat(id,update);
        return ResponseEntity.ok("Đã Cập Nhật Thành Công");
    }
    @PostMapping("/save")
    public ResponseEntity<?> addGoat(@Valid @RequestBody GoatRequestDto goatRequestDto) {
            return ResponseEntity.ok(goatService.getAddGoat(goatRequestDto));
    }
}
