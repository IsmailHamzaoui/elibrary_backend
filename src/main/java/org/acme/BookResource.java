package org.acme;

import org.acme.dto.BookDto;
import org.acme.entity.BookEntity;
import org.acme.entity.StudentEntity;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/book")
public class BookResource {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<BookDto> hello() {

        List<BookEntity> bookEntities = BookEntity.listAll();
        List<BookDto> bookDtos = bookEntities.stream()
                .map(bookEntity ->  BookDto.from(bookEntity))
                .collect(Collectors.toList());

        return bookDtos;
    }
    @POST
    @Path("/registre")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean register(BookEntity bookEntity){
        bookEntity.persist();
        return true;
    }
}