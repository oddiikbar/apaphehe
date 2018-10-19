package com.apap.tugas1.service;

import com.apap.tugas1.model.ProvinsiModel;
import com.apap.tugas1.repository.ProvinsiDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProvinsiServiceImpl implements ProvinsiService {
    @Autowired
    ProvinsiDb provinsiDb;

    @Override
    public List<ProvinsiModel> getAllProvinsi() {
        return provinsiDb.findAllByIdIsNotNullOrderByNamaDesc();
    }

    @Override
    public ProvinsiModel getProvinsiByIdProvinsi(Integer id) {
        return provinsiDb.findById(id);
    }
}
