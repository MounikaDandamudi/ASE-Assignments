

/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/poundtokgs")
public class KtoM {


	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double kgs;
		Double pounds = 36.8;
		kgs = (pounds * 0.454) ;
 
		String result = "@Produces(\"application/xml\") Output: \n\nPounds to Kgs Converter Output: \n\n" + kgs;
		return "<ptokgservice>" + "<kgs>" + pounds + "</kilometers>" + "<ptokgoutput>" + result + "</mtokoutput>" + "</mtokservice>";
	}
 
	@Path("{k}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("k") Double k) {
		Double kgs;
		Double pounds = k;
		kgs = (pounds *0.454);
 
		String result = "@Produces(\"application/xml\") Output: \n\nPounds to Kgs Converter Output: \n\n" + kgs;
		return "<mtokservice>" + "<kilometers>" + pounds + "</kilometers>" + "<mtokoutput>" + result + "</mtokoutput>" + "</mtokservice>";
	}
}