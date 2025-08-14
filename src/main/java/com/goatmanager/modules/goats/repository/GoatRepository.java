package com.goatmanager.modules.goats.repository;

import com.goatmanager.modules.goats.entity.Goats;
import com.goatmanager.modules.goats.enum_.enum_goats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GoatRepository extends JpaRepository<Goats, Long> {
    @Query("SELECT g FROM Goats g WHERE (:status IS NULL OR g.status = :status) AND (:active IS NULL OR g.active = :active)")
    List<Goats> findGoatsByStatusAndActiveOptional(@Param("status") enum_goats status,
                                                   @Param("active") Boolean active);



}
