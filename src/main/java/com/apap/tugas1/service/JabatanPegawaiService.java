package com.apap.tugas1.service;

import com.apap.tugas1.model.JabatanPegawaiModel;

import java.util.List;

public interface JabatanPegawaiService {
    List<JabatanPegawaiModel> getJabatanPegawaiListByIdPegawai(Long idPegawai);
}
