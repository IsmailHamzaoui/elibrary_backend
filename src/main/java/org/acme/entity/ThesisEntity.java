package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="thesis")
public class ThesisEntity extends PanacheEntityBase {
    @Id
    @Column(name = "thesis_id")
    public String thesis_id;

    @Column(name = "thesis_title")
    public  String thesis_title;

    @Column(name = "thesis_date")
    public Date thesis_date;

    @Column(name = "thesis_student")
    public String thesis_student;
}
