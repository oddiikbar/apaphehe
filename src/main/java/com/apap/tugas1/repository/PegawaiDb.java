package com.apap.tugas1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apap.tugas1.model.PegawaiModel;

import java.util.Date;
import java.util.List;

@Repository
public interface PegawaiDb extends JpaRepository<PegawaiModel, Long>{
	PegawaiModel findByNip (String nip);
	PegawaiModel save (PegawaiModel pegawaiModel);

	@Query(value="SELECT * FROM pegawai WHERE id_instansi = :idInstansi AND tahun_masuk = :tahunMasuk " +
			"AND tanggal_lahir = :tanggalLahir", nativeQuery = true)
	List<PegawaiModel> findPegawaiModelsById_instansiAndAndTahun_masukAndAndTanggal_lahirOrderByNipDesc(
			@Param("idInstansi")Long idInstansi, @Param("tahunMasuk")String tahunMasuk, @Param("tanggalLahir")Date tanggalLahir);
}
