package AbstractFactoryPattern;

public interface BollywoodMovie {
 void getMoviename();
}

class BollywoodComedymovie implements BollywoodMovie{

	@Override
	public void getMoviename() {
		// TODO Auto-generated method stub
		System.out.println("Bollywood Comedy Movie: Munna Bhai");
	}
	
}
class BollywoodActionmovie implements BollywoodMovie{

	@Override
	public void getMoviename() {
		// TODO Auto-generated method stub
		System.out.println("Bollywood Action Movie: Bang Bang");
	}
	
}
