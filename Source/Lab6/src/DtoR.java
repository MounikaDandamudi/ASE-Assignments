import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	import javax.ws.rs.PathParam;
	import javax.ws.rs.Produces;
	@Path("/dtor")
	public class DtoR {	 
	
		@GET
		@Produces("application/xml")
		public String dtoR() {
	 
			Double RUPEE;
			Double DOLLOR = 1.0;
			RUPEE = DOLLOR * 68;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nD to R Converter Output: \n\n" + RUPEE;
			return "<dtor>" + "<DOLLOR>" + DOLLOR + "</DOLLOR>" + "<dtoroutput>" + result + "</dtoroutput>" + "</dtor>";
		}
	 
		@Path("{D}")
		@GET
		@Produces("application/xml")
		public String convertCtoFfromInput(@PathParam("D") Double D) {
			Double RUPEE;
			Double DOLLOR = D;
			RUPEE = DOLLOR * 68;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nD to R Converter Output: \n\n" + RUPEE;
			return "<dtor>" + "<DOLLOR>" + DOLLOR + "</DOLLOR>" + "<dtoroutput>" + result + "</dtoroutput>" + "</dtor>";
		}
	}