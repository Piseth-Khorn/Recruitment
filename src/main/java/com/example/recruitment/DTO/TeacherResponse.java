package com.example.recruitment.DTO;

import com.example.recruitment.model.ClassRoom;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TeacherResponse {
    private int id;
    private String name;
    @JsonIgnore
    private ClassRoom classRoom;
    // ---- more properties

    public Map<String,Object> getObject(){
        Map<String,Object>map=new HashMap<>();
        map.put("id",this.classRoom.getId());
        map.put("FullName",this.classRoom.getName());
        return map;
    }

}
