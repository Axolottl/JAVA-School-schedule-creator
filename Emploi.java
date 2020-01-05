
import java.util.Collections;
import java.util.Random;

import exam.Emploi;

public class Emploi {
	public String name ;
	public int hours ;
	 public long getHours() {
		    return hours;
		  }

		  public void setHours(int hours) {
		    this.hours = hours;
		  }

		  public String getName() {
		    return name;
		  }

		  public void setName(String name) {
		    this.name = name;
		  }
		  			
			  
			  Emploi emploi1 = new Emploi();
			  Emploi emploi2 = new Emploi();
			  Emploi emploi3 = new Emploi();	
			  Emploi emploi4 = new Emploi();	
			  Emploi emploi5 = new Emploi();
			  Emploi emploi6 = new Emploi();	
			  Emploi emploi7 = new Emploi();	
			  Emploi emploi8 = new Emploi();	
			  Emploi emploi9 = new Emploi();	
			  Emploi emploi10 = new Emploi();	
			  Emploi emploi11 = new Emploi();	
			  Emploi emploi12 = new Emploi();	
			  Emploi emploi13 = new Emploi();	
			  Emploi emploi14 = new Emploi();
			  Emploi emploi15 = new Emploi();	
			  Emploi emploi16 = new Emploi();	
			  Emploi emploi17 = new Emploi();	
			  Emploi emploi18 = new Emploi();	
			  Emploi emploi19 = new Emploi();	
			  Emploi emploi20 = new Emploi();
			  
			  
			  public void foo(@RequestParam("seance[]") List<String> to) { 
			  Collections.shuffle( to , new Random(3));
			  }
			  
			  
			  
		  }
		  

}
