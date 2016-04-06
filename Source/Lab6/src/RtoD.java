import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/rtod")
public class RtoD {
	@GET
	@Produces("application/xml")
	public String dtoR() {
 
		Double DOLLOR;
		Double RUPEE = 1.0;
		DOLLOR = RUPEE * 0.015;
 
		String result = "@Produces(\"application/xml\") Output: \n\nR to D Converter Output: \n\n" + DOLLOR;
		return "<rtod>" + "<RUPEE>" + RUPEE + "</RUPEE>" + "<rtodoutput>" + result + "</rtodoutput>" + "</rtod>";
	}
 
	@Path("{D}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("D") Double D) {
		Double DOLLOR;
		Double RUPEE = D;
		DOLLOR = RUPEE * 0.015;
 
		String result = "@Produces(\"application/xml\") Output: \n\nR to D Converter Output: \n\n" + DOLLOR;
		return "<rtod>" + "<RUPEE>" + RUPEE + "</RUPEE>" + "<rtodoutput>" + result + "</rtodoutput>" + "</rtod>";
	}
}
