package com.busecnky.repository;

import com.busecnky.repository.entity.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVillageRepository extends JpaRepository<Village,Long> {

}
