package org.acme;

import org.acme.dto.ThesisDto;
import org.acme.entity.ThesisEntity;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("thesis")
public class ThesisResources {
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<ThesisDto> hello(){
        List<ThesisEntity> thesisEntities = ThesisEntity.listAll();
        List<ThesisDto> thesisDtos = thesisEntities.stream()
                .map(thesisEntity ->   ThesisDto.from(thesisEntity))
                .collect(Collectors.toList());

        return thesisDtos;
    }
}
