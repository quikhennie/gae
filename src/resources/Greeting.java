package resources;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/hr/")
public class Greeting {

	@GET
	@Produces("text/plain")
	@Path("employee")
	public String getEmployee() {
		return "What World 3";
	}
		
}
