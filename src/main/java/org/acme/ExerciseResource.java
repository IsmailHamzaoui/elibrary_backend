package org.acme;

        import org.acme.dto.ExerciseDto;
        import org.acme.entity.ExerciseEntity;

        import javax.ws.rs.Consumes;
        import javax.ws.rs.GET;
        import javax.ws.rs.Path;
        import javax.ws.rs.Produces;
        import javax.ws.rs.core.MediaType;
        import java.util.List;
        import java.util.stream.Collectors;

@Path("/exercise")
public class ExerciseResource {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<ExerciseDto> hello(){
        List<ExerciseEntity> exerciseEntities = ExerciseEntity.listAll();
        List<ExerciseDto> exerciseDtos = exerciseEntities.stream()
                .map(exerciseEntity ->   ExerciseDto.from(exerciseEntity))
                .collect(Collectors.toList());

        return exerciseDtos;
    }
}
