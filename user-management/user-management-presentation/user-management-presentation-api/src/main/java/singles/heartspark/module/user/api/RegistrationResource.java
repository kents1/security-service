package singles.heartspark.module.user.api;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@ApplicationScoped
@Path("registrations")
public class RegistrationResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create() {
        return Response.created(URI.create(String.format("/registrations/%s", ""))).build();
    }

}
