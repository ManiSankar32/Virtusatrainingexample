package AbstractFactoryPattern;

interface TollywoodMovie {
	 public void getMoviename();
	 
	}
	class TollywoodComedymovie implements TollywoodMovie{
		public void getMoviename()
		{
			System.out.println("Sudigadu is a Tollywood comedy movie");
		}
	}

	class TollywoodActionmovie implements TollywoodMovie{
		public void getMoviename() {
			System.out.println("Saaho i a Tollywood action movie");
		}
	}
