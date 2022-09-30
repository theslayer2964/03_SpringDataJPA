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
	
	@Query(value = "select sum(Luong) from nhanVien ", nativeQuery = true)
	double getTongLuong();
	
	@Query(value = "select nv.MaNV from nhanVien nv join chungnhan vn on nv.MaNV = vn.MaNV join MayBay m on vn.MaMB = m.MaMB where Loai like '%boeing%' ", nativeQuery = true)
	List<String> getNvLaiBoeing();
	
	@Query(value = "select nv.MaNV from nhanVien nv join chungnhan vn on nv.MaNV = vn.MaNV join MayBay m on vn.MaMB = m.MaMB where m.MaMB = 747 ", nativeQuery = true)
	List<String> getNVLai747();
	@Query(value = "select nv.MaNV from nhanVien nv join chungnhan vn on nv.MaNV = vn.MaNV \r\n"
			+ "	join MayBay m on vn.MaMB = m.MaMB where loai like '%airbus%' and nv.MaNV in \r\n"
			+ "    (select nv.MaNV from nhanVien nv join chungnhan vn on nv.MaNV = vn.MaNV \r\n"
			+ "	join MayBay m on vn.MaMB = m.MaMB where loai like '%boeing%')", nativeQuery = true)
	List<String> getNVBeingNAirbus();
}
