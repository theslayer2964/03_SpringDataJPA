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
}
