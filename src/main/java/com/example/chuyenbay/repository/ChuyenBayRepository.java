package com.example.chuyenbay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.chuyenbay.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String>{
	
	@Query(value = "select * from chuyenbay where GaDi like 'DAD'", nativeQuery = true)
	List<ChuyenBay> getChuyenBayDiDAD();
	
	@Query(value = "select * from chuyenbay where DoDai between 8000 and 10000 ", nativeQuery = true)
	List<ChuyenBay> getChuyenBayTheoDoDai();
	
	@Query(value = "select * from chuyenbay where GaDi like 'SGN' and GaDen like 'BMV' ", nativeQuery = true)
	List<ChuyenBay> getChuyenBayHCMDiBMT();
	
	@Query(value = "SELECT COUNT(*) from chuyenbay where GaDi like 'SGN' ", nativeQuery = true)
	int getSoChuyenBayHCM();
	
	@Query(value = " select * from chuyenbay where dodai < (select tambay from maybay where Loai like '%Airbus A320%') ", nativeQuery = true)
	List<ChuyenBay> getCBBoiMBA320();
}
