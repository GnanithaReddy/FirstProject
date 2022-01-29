import java.util.Arrays;
import java.util.List;

public class Welcome {
	
	
	 public static void main( String[] args )
	    {
	        List<People> perform = Arrays.asList(
	        		new People("Gurrala","Gnanitha",1),
	        		new People("Gurrala","Chandrika",27),
	        		new People("Gurrala","Narendra",39));
	      
		    perform.stream().filter(p -> p.getLname().startsWith("G"))
		    .forEach(p -> System.out.println(p.getLname()));
		    //long result = 	.count();
		    //System.out.println("Result is :" +result);
	    }

}



