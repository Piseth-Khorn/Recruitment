package com.example.recruitment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(exclude = "teachers")
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity(name = "ClassRoom")
@EqualsAndHashCode
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "aClassRoom", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Teacher> teachers = new ArrayList<>();


}
