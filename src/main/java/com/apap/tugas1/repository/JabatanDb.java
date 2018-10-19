package com.apap.tugas1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apap.tugas1.model.JabatanModel;

import java.util.List;

public interface JabatanDb extends JpaRepository<JabatanModel, Long>{
	List<JabatanModel> findJabatanModelsById(Long id);
    JabatanModel findJabatanModelById(Long id);

    List<JabatanModel> getAllByIdIsNotNull();
}
