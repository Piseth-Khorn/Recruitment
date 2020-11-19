package com.example.recruitment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@ToString(exclude = "aClassRoom")
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity(name = "Teacher")
@EqualsAndHashCode
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    @ManyToOne(fetch = FetchType.EAGER)
    private ClassRoom aClassRoom;
}
