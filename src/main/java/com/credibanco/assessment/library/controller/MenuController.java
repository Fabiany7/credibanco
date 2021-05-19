package com.credibanco.assessment.library.controller;

import com.credibanco.assessment.library.dto.AutorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MenuController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        String sql = "SELECT * FROM autor";
        List<AutorDto> students = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(AutorDto.class));
        students.forEach(System.out :: println);
        System.out.println("hola");
        return String.format("Hello %s!", students.get(0).nombre);
    }
}
