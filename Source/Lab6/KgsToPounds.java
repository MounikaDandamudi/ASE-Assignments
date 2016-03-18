<<<<<<< HEAD
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/kgstopounds")
	public class KgsToPounds {


		@GET
		@Produces("application/xml")
		public String convertKgtoP() {
	 
			Double pounds;
			Double kgs = 36.8;
			pounds = (kgs * 2.2046) ;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nKg to Pounds Converter Output: \n\n" + pounds;
			return "<kgtopservice>" + "<pounds>" + kgs + "</kgs>" + "<kgtopoutput>" + result + "</kgtpkoutput>" + "</ktopservice>";
		}
		@Path("{k}")
		@GET
		@Produces("application/xml")
		public Double convertKgtoPfromInput(@PathParam("k") Double k) {
			Double pounds,result;
			Double kgs= k;
			pounds = (kgs *2.2046);
			result=pounds;
			//String result = "@Produces(\"application/xml\") Output: \n\nKg to Pounds Converter Output: \n\n" + pounds;
			//return "<kgtopservice>" + "<kgs>" + kgs + "</kgs>" + "<kgtopoutput>" + result + "</kgtopoutput>" + "</kgtopservice>";
			return result;
		}

}
=======
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/kgstopounds")
	public class KgsToPounds {


		@GET
		@Produces("application/xml")
		public String convertKgtoP() {
	 
			Double pounds;
			Double kgs = 36.8;
			pounds = (kgs * 2.2046) ;
	 
			String result = "@Produces(\"application/xml\") Output: \n\nKg to Pounds Converter Output: \n\n" + pounds;
			return "<kgtopservice>" + "<pounds>" + kgs + "</kgs>" + "<kgtopoutput>" + result + "</kgtpkoutput>" + "</ktopservice>";
		}
		@Path("{k}")
		@GET
		@Produces("application/xml")
		public Double convertKgtoPfromInput(@PathParam("k") Double k) {
			Double pounds,result;
			Double kgs= k;
			pounds = (kgs *2.2046);
			result=pounds;
			//String result = "@Produces(\"application/xml\") Output: \n\nKg to Pounds Converter Output: \n\n" + pounds;
			//return "<kgtopservice>" + "<kgs>" + kgs + "</kgs>" + "<kgtopoutput>" + result + "</kgtopoutput>" + "</kgtopservice>";
			return result;
		}

}
>>>>>>> origin/master
