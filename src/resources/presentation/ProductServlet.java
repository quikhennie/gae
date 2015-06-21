package resources.presentation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/product/")
public class ProductServlet {
	
	@GET
	@Produces("text/plain")
	@Path("employee")
	public String getEmployee() {
		return "What World 4";
	}

}
