package com.apap.tugas1.service;

import com.apap.tugas1.model.InstansiModel;
import com.apap.tugas1.repository.InstansiDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InstansiServiceImpl implements InstansiService{
    @Autowired
    InstansiDb instansiDb;

    @Override
    @Transactional(readOnly = false)
    public List<InstansiModel> getAllInstansi(Integer id) {
        return instansiDb.findAllById_provinsi(id);
    }

    @Override
    public InstansiModel getInstansibyNamaAndIdProvinsi(String nama, Long id_provinsi) {
        return instansiDb.findInstansiModelByNamaAndId_provinsi(nama, id_provinsi);
    }

    @Override
    public InstansiModel getInstansiDetailByIdInstansi(Long id) {
        return instansiDb.findInstansiModelById(id);
    }
}
