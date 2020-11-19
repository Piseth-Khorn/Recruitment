package com.example.recruitment.controllers;

import com.example.recruitment.DTO.TeacherResponse;
import com.example.recruitment.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    private final TeacherRepository teacherRepository;
    private final EntityManager entityManager;

    @Autowired
    public TeacherController(TeacherRepository teacherRepository, EntityManager entityManager) {
        this.teacherRepository = teacherRepository;
        this.entityManager = entityManager;
    }
    @GetMapping
    public ResponseEntity<?>getTeacher(){
        Query query = entityManager.createQuery("select new com.example.recruitment.DTO.TeacherResponse(t.id,t.name,t.aClassRoom) from Teacher t");
        List<TeacherResponse> teacherResponses = query.getResultList();
        return new ResponseEntity<>(teacherResponses, HttpStatus.ACCEPTED);
    }
}
