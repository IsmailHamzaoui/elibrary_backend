package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.acme.dto.StudentDto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="student")
public class StudentEntity extends PanacheEntityBase {
    @Id
    @Column(name = "student_id")
    public String student_id;

    @Column(name = "username")
    public  String username;

    @Column(name = "phone_number")
    public long phone_number;

    @Column(name = "email")
    public String email;

    @Column(name = "password")
    public String password;

    @Column(name = "rfid_tag")
    public double rfid_tag;

    public static StudentEntity create (StudentDto studentDto){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.email = studentDto.email;
        studentEntity.password = studentDto.password;
        studentEntity.phone_number = studentDto.phone_number;
        studentEntity.username = studentDto.username;
        studentEntity.student_id = UUID.randomUUID().toString();
        return studentEntity;
    }
}
