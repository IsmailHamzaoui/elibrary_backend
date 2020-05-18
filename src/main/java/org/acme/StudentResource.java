package org.acme;

import org.acme.dto.StudentDto;
import org.acme.entity.StudentEntity;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/student")
public class StudentResource {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<StudentDto> hello(){
        List<StudentEntity> studentEntities = StudentEntity.listAll();
        List<StudentDto> studentDtos = studentEntities.stream()
                .map(studentEntity ->   StudentDto.from(studentEntity))
                .collect(Collectors.toList());

        return studentDtos;
    }

    @POST
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response register(StudentDto studentDto){
        try {
            StudentEntity studentEntity = StudentEntity.create(studentDto);
            studentEntity.persist();
        }catch (RuntimeException ex){
            System.out.println(ex);
            return Response.status(500).build();
        }
        return Response.ok(true).build();
    }
}
