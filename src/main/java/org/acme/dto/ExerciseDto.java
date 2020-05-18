package org.acme.dto;


import org.acme.entity.ExerciseEntity;

public class ExerciseDto {
    public String exercise_subject;
    public String exercise_date;

    public static ExerciseDto from(ExerciseEntity exerciseEntity){
        var dto = new ExerciseDto();
        dto.exercise_subject = exerciseEntity.exercise_subject;
        dto.exercise_date = exerciseEntity.exercise_date;
        return dto;
    }
}
