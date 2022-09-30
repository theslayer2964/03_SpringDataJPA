package com.example.chuyenbay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chuyenbay.entity.ChuyenBay;
import com.example.chuyenbay.repository.ChuyenBayRepository;

@RestController
@RequestMapping("/api/chuyenBay")
public class ChuyenBayController {
		@Autowired
		ChuyenBayRepository chuyenBayRepository;
		
		@GetMapping("/getChuyenBayDiDAD")
		public List<ChuyenBay> getListCBDiDAD(){
			return chuyenBayRepository.getChuyenBayDiDAD();
		}
		@GetMapping("/getChuyenBayTheoDoDai")
		public List<ChuyenBay> getListCBTheoDoDai(){
			return chuyenBayRepository.getChuyenBayTheoDoDai();
		}
		@GetMapping("/getChuyenBayHCMdiBMT")
		public List<ChuyenBay> getListCBHMTdiBMT(){
			return chuyenBayRepository.getChuyenBayHCMDiBMT();
		}
		@GetMapping("/getSoChuyenBayHCM")
		public List<ChuyenBay> getSoChuyenBayHCM(){
			return chuyenBayRepository.getSoChuyenBayHCM();
		}
		
}
