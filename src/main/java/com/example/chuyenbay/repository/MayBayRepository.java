package com.example.chuyenbay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.chuyenbay.entity.MayBay;

@Repository
public interface MayBayRepository extends CrudRepository<MayBay	, String> {
	
	@Query(value = "select * from maybay where Loai like '%Airbus%' ", nativeQuery = true)
	List<MayBay> findMayBayAirbus();
}
