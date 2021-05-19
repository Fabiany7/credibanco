package com.credibanco.nexos.credibanco;

import com.credibanco.assessment.library.dto.AutorDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

@SpringBootApplication
@RestController
public class CredibancoApplication {



	public static void main(String[] args) {
		SpringApplication.run(CredibancoApplication.class, args);
	}



}
