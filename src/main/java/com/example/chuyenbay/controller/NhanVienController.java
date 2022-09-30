package com.example.chuyenbay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chuyenbay.entity.NhanVien;
import com.example.chuyenbay.repository.NhanVienRepository;

@RestController
@RequestMapping("/api/nhanVien")
public class NhanVienController {

	@Autowired
	NhanVienRepository nhanVienRepository;
	
	@GetMapping("/nvLuong10")
	public List<NhanVien> getNVLuong10(){
		return nhanVienRepository.getNVLuong10();
	}
	@GetMapping("/getTongLuong")
	public double getTongLuong(){
		return nhanVienRepository.getTongLuong();
	}
	@GetMapping("/getNvLaiBoeing")
	public List<String> getNvLaiBoeing(){
		return nhanVienRepository.getNvLaiBoeing();
	}
	@GetMapping("/getNVLai747")
	public List<String> getNVLai747(){
		return nhanVienRepository.getNVLai747();
	}
}
