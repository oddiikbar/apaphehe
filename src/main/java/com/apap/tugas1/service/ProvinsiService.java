package com.apap.tugas1.service;

import com.apap.tugas1.model.ProvinsiModel;

import java.util.List;

public interface ProvinsiService {
    ProvinsiModel getProvinsiByIdProvinsi(Integer id);
    List<ProvinsiModel> getAllProvinsi();
}
