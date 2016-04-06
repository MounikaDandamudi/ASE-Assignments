import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

	@Path("/inchtocm")
	public class InchToCm {


		@GET
		@Produces("application/xml")
		public String convertItoC() {
	 
			Double cm;
			Double inch = 36.5;
			cm = (inch * 2.54) ;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nInch to Cm Converter Output: \n\n" + cm;
			return "<itocservice>" + "<inch>" + inch + "</inch>" + "<itocoutput>" + result + "</itocoutput>" + "</itocservice>";
		}
		@Path("{k}")
		@GET
		@Produces("application/xml")
		public Double convertInchToCmfromInput(@PathParam("k") Double k) {
			Double cm,result;
			Double inch = k;
			cm = (inch *2.54);
			result=cm;
			return result;
	 
			//String result = "@Produces(\"application/xml\") Output: \n\nInch to Cm Converter Output: \n\n" + cm;
			//return "<itocservice>" + "<inch>" + inch + "</inch>" + "<itocoutput>" + result + "</itocoutput>" + "</itocservice>";
		}

}
