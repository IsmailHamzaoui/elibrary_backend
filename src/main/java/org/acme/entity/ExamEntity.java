package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class ExamEntity extends PanacheEntityBase {
    @Id
    @Column(name = "exam_id")
    public String exam_id;

    @Column(name = "exam_subject")
    public  String exam_subject;

    @Column(name = "exam_date")
    public String exam_date;

    @Column(name = "exam_type")
    public String exam_type;
}
