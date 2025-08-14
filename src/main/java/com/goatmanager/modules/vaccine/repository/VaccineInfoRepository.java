package com.goatmanager.modules.vaccine.repository;

import com.goatmanager.modules.vaccine.entity.VaccineInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineInfoRepository extends JpaRepository<VaccineInfo, Long> {
}
