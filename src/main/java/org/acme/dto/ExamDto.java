package org.acme.dto;

import org.acme.entity.ExamEntity;

public class ExamDto {
    public String exam_subject;
    public String exam_date;
    public String exam_type;

    public static ExamDto from(ExamEntity examEntity){
        var dto = new ExamDto();
        dto.exam_subject = examEntity.exam_subject;
        dto.exam_date = examEntity.exam_date;
        dto.exam_type = examEntity.exam_type;
        return dto;
    }
}
