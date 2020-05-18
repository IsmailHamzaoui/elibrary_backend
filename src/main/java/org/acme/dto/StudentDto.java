package org.acme.dto;
import org.acme.entity.StudentEntity;

public class StudentDto {
    public String username;
    public long phone_number;
    public String email;
    public String password;
    public Double rfid_tag;

    public static StudentDto from(StudentEntity studentEntity){
        var dto = new StudentDto();
        dto.username = studentEntity.username;
        dto.phone_number = studentEntity.phone_number;
        dto.email = studentEntity.email;
        dto.password = studentEntity.password;
        dto.rfid_tag = studentEntity.rfid_tag;
        return dto;
    }
}
