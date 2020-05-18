package org.acme.dto;



import org.acme.entity.ThesisEntity;
import java.sql.Date;

public class ThesisDto {
    public String thesis_title;
    public Date thesis_date;
    public String thesis_student;


    public static ThesisDto from(ThesisEntity thesisEntity){
        var dto = new ThesisDto();
        dto.thesis_title = thesisEntity.thesis_title;
        dto.thesis_date = thesisEntity.thesis_date;
        dto.thesis_student = thesisEntity.thesis_student;
        return dto;
    }
}
