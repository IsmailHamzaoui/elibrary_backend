package org.acme;

import org.acme.dto.ExamDto;
import org.acme.entity.ExamEntity;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/exam")
public class ExamResource {
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<ExamDto> hello(){
        List<ExamEntity> examEntities = ExamEntity.listAll();
        List<ExamDto> examDtos = examEntities.stream()
                .map(examEntity ->   ExamDto.from(examEntity))
                .collect(Collectors.toList());

        return examDtos;
    }
}
