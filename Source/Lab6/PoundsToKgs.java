<<<<<<< HEAD
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

	@Path("/poundstokg")
	public class PoundsToKgs {


		@GET
		@Produces("application/xml")
		public String convertCtoF() {
	 
			Double kgs;
			Double pound = 36.8;
			kgs = (pound * 0.454) ;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nPounds to Kg Converter Output: \n\n" + kgs;
			return "<ptokservice>" + "<kgs>" + pound + "</kgs>" + "<ptokoutput>" + result + "</ptokoutput>" + "</ptokservice>";
		}
		@Path("{k}")
		@GET
		@Produces("application/xml")
		public Double convertPoundtoKgfromInput(@PathParam("k") Double i) {
			Double kgs,result;
			Double pound = i;
			kgs = (pound *0.454);
			result=kgs;
			return result;
	//		String result = "@Produces(\"application/xml\") Output: \n\nPound to Kg Converter Output: \n\n" + kgs;
		//	return "<ptokservice>" + "<pounds>" + pound + "</pounds>" + "<ptokoutput>" + result + "</ptokoutput>" + "</ptokservice>";
		}

}
=======
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

	@Path("/poundstokg")
	public class PoundsToKgs {


		@GET
		@Produces("application/xml")
		public String convertCtoF() {
	 
			Double kgs;
			Double pound = 36.8;
			kgs = (pound * 0.454) ;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nPounds to Kg Converter Output: \n\n" + kgs;
			return "<ptokservice>" + "<kgs>" + pound + "</kgs>" + "<ptokoutput>" + result + "</ptokoutput>" + "</ptokservice>";
		}
		@Path("{k}")
		@GET
		@Produces("application/xml")
		public Double convertPoundtoKgfromInput(@PathParam("k") Double i) {
			Double kgs,result;
			Double pound = i;
			kgs = (pound *0.454);
			result=kgs;
			return result;
	//		String result = "@Produces(\"application/xml\") Output: \n\nPound to Kg Converter Output: \n\n" + kgs;
		//	return "<ptokservice>" + "<pounds>" + pound + "</pounds>" + "<ptokoutput>" + result + "</ptokoutput>" + "</ptokservice>";
		}

}
>>>>>>> origin/master
