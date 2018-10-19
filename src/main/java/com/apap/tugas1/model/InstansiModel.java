package com.apap.tugas1.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="instansi")
public class InstansiModel implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Size(max=20)
	@Column(name="id", nullable=false)
    private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public Integer getId_provinsi() {
		return id_provinsi;
	}

	public void setId_provinsi(Integer id_provinsi) {
		this.id_provinsi = id_provinsi;
	}

	@NotBlank
	@Size(max=255)
	@Column(name="nama", nullable=false)
    public String nama;
	
	@NotBlank
	@Size(max=255)
	@Column(name="deskripsi", nullable=false)
    public String deskripsi;
	
	@NotBlank
	@JoinColumn(name="id_provinsi", referencedColumnName="id")
	@Size(max=20)
	@Column(name="id_provinsi", nullable=false)
    public Integer id_provinsi;
}
