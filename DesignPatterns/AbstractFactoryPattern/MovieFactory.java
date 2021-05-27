package AbstractFactoryPattern;

public abstract class MovieFactory {
 public abstract TollywoodMovie getTollywoodmovie(String movie); 
 public abstract BollywoodMovie getBollywoodmovie(String movie);
}

 class TollywoodFactory extends MovieFactory{

	public TollywoodMovie getTollywoodmovie(String movie) {
		// TODO Auto-generated method stub
		if(movie == null)
		{
		   return null;
		}
		if(movie.equalsIgnoreCase("TollywoodComedymovie"))
		{
			return new TollywoodComedymovie() ;
		}
		else if(movie.equalsIgnoreCase("TollywoodActionmovie"))
		{
			return new TollywoodActionmovie();
		}
		return null;
	}

	@Override
	public BollywoodMovie getBollywoodmovie(String movie) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class BollywoodFactory extends MovieFactory{

	public BollywoodMovie getBollywoodmovie(String movie) {
		// TODO Auto-generated method stub
		if(movie == null)
		{
		   return null;
		}
		if(movie.equalsIgnoreCase("BollywoodComedymovie"))
		{
			return new BollywoodComedymovie() ;
		}
		else if(movie.equalsIgnoreCase("BollywoodActionmovie"))
		{
			return new BollywoodActionmovie();
		}
		return null;
	}

	@Override
	public TollywoodMovie getTollywoodmovie(String movie) {
		// TODO Auto-generated method stub
		return null;
	}
	
}