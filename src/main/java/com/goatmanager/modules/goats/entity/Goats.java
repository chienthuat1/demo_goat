package com.goatmanager.modules.goats.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goatmanager.modules.vaccine.entity.VaccineInfo;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.goatmanager.modules.goats.enum_.enum_goats;

@Entity
@Data
@Table(name = "goats")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Goats {
    @Id
    @Column(name = "id_goat")
    private Long id_goat;
    @Column(name = "gender", nullable = false)
    private boolean gender;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthday;
    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false)
    private enum_goats status;
    @Column(name = "weight", nullable = false)
    private int weight;
    @Column(name = "qr_code_url")
    private String qr_code;
    @Column(name = "image_url")
    private String img_url;
    @Column(name = "description_goat",columnDefinition = "TEXT")
    private String description;
    @JsonIgnore
    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;
    @JsonIgnore
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updated_at;
    @JsonIgnore
    @Column(name = "active")
    private boolean active;

    @OneToMany(mappedBy = "goats", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<VaccineInfo> vaccineInfos;

}
