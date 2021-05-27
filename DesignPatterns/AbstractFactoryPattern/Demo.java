package AbstractFactoryPattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MovieFactory moviefactory = MovieFactoryProducer.getFactory("BollywoodMovie");
     MovieFactory tollyfactory = MovieFactoryProducer.getFactory("TollywoodMovie");
    
     BollywoodMovie actionmov = moviefactory.getBollywoodmovie("BollywoodActionmovie");
     actionmov.getMoviename(); 
    
     TollywoodMovie cmov = tollyfactory.getTollywoodmovie("TollywoodComedymovie");
     cmov.getMoviename();
     
     System.out.println("");
     
     TollywoodMovie amov = tollyfactory.getTollywoodmovie("TollywoodActionmovie");
     amov.getMoviename();
     
     BollywoodMovie bmovie = moviefactory.getBollywoodmovie("BollywoodComedymovie");
     bmovie.getMoviename();
    
     
	}

}
