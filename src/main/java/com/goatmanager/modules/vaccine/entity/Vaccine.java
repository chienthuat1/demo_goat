package com.goatmanager.modules.vaccine.entity;


import lombok.*;
import jakarta.persistence.*;
@Entity
@Data
@Table(name = "vaccines")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vaccine",nullable = false)
    private int id_vaccine;
    @Column(name="vaccine_name", nullable=false)
    private String vaccine_name;
    @Column(name="vaccine_manufacturer", nullable=false)
    private String vaccine_manufacturer;
    @Column(name="description",nullable=true)
    private String vaccine_description;
}
