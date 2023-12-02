package net.developia.spring03.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
import net.developia.spring03.domain.SampleDTO;

@RestController
@RequestMapping("/ajax")
@Log
public class SampleController {
	@PostMapping("/posttest")
	public ResponseEntity<String> posttest(){
		
		String msg = "실수란 신을 용서하는 인간의 행위이다";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-type", "plain/text;charset=UTF-8");
		
		return new ResponseEntity<>(msg, header, HttpStatus.OK);
	}

	
	@GetMapping("/jsontest")
	public ResponseEntity<SampleDTO> ex07(){
		log.info("/ex07...........................");
		
		SampleDTO dto = new SampleDTO();
		dto.setAge(20);
		dto.setName("이상민");
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(dto, header, HttpStatus.OK);
	}

}
