package com.goatmanager.modules.vaccine.entity;

import com.goatmanager.modules.goats.entity.Goats;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
@Entity
@Table(name = "vaccination_history")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VaccineInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_history")
    private long id_history;
    @Column(name = "goat_id",nullable = false)
    private Long goat_id;
    @Column(name = "vaccine_id",nullable = false)
    private Long vaccine_id;
    @Column(name = "date_vaccine",nullable = false)
    private LocalDate date_vaccine;
    @Column(name = "note",nullable = true)
    private String note;
    @JsonIgnore
    @Column(name = "created_at",nullable = false)
    private LocalDateTime created_at;
    @ManyToOne
    @JoinColumn(name = "id_goat")
    private Goats goats     ;
    @OneToOne
    @JoinColumn(name = "id_vaccine")
    private Vaccine vaccine;
}
