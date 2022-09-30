package com.example.chuyenbay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chuyenbay.entity.MayBay;
import com.example.chuyenbay.repository.MayBayRepository;

@RestController
@RequestMapping("/api/mayBay")
public class MayBayController {
	
	@Autowired
	MayBayRepository mayBayRepository;
	
	@GetMapping("/getMayBayAirbus")
	public List<MayBay> getMayBayAirbus() {
		return mayBayRepository.findMayBayAirbus();
	}
	
	
}
