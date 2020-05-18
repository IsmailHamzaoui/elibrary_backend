package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exercise")
public class ExerciseEntity extends PanacheEntityBase {
    @Id
    @Column(name = "exercise_id")
    public String exercise_id;

    @Column(name = "exercise_subject")
    public  String exercise_subject;

    @Column(name = "exercise_date")
    public String exercise_date;

}
