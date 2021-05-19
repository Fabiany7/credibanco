package com.credibanco.assessment.library.controller;

import com.credibanco.assessment.library.dto.AutorDto;
import com.credibanco.assessment.library.repo.IAutorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MenuController {

    @Autowired
    private IAutorDto autorDto;

    @GetMapping("/autor")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    @GetMapping("/listarautor")
    public String hello(Model model) {
        return String.format("Hello %s!", name);
    }
}
