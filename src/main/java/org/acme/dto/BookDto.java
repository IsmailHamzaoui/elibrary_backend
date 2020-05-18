package org.acme.dto;
import org.acme.entity.BookEntity;
import java.sql.Date;


public class BookDto{

    public String title;
    public String publisher;
    public String author;
    public Date date;
    public boolean status;

    public static BookDto from(BookEntity bookEntity){
        var dto = new BookDto();
        dto.title = bookEntity.title;
        dto.author = bookEntity.author;
        dto.publisher = bookEntity.publisher;
        dto.date = bookEntity.date;
        dto.status = bookEntity.status;
        return dto;
    }
}
