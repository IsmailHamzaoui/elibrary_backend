package org.acme.entity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "book")
public class BookEntity  extends PanacheEntityBase {

    @Id
    @Column(name = "book_id")
    public String book_id;

    @Column(name = "title")
    public  String title;

    @Column(name = "publisher")
    public String publisher;

    @Column(name = "author")
    public String author;

    @Column(name = "book_date")
    public Date date;

    @Column(name = "status")
    public boolean status;

}
