package com.example.chuyenbay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.chuyenbay.entity.NhanVien;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, String> {
	
	@Query(value = "select * from nhanVien where Luong < 10000", nativeQuery = true)
	List<NhanVien> getNVLuong10();
}
