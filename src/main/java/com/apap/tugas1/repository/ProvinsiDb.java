package com.apap.tugas1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tugas1.model.ProvinsiModel;

import java.util.List;

@Repository
public interface ProvinsiDb extends JpaRepository<ProvinsiModel, Long>{
    ProvinsiModel findById(Integer id);
    List<ProvinsiModel> findAllByIdIsNotNullOrderByNamaDesc();
}
