abstract class Shape
{
    abstract void area();
    public void Setcolor(String color){
        System.out.println(color);
    }
}
class Circle extends Shape
{
    int r=4;
    public void area()
    {
        System.out.println(3.14 * r *r);
    }
}
class Square extends Shape
{
    public void area()
    {
        System.out.println(4.0 * 4.0);
    }
    
}
public class AbstractDemo
{
	public static void main(String[] args) {
		Circle c = new Circle();
		Square s = new Square();
		c.area();
		c.Setcolor("red");
		s.area();
		s.Setcolor("Yellow");
		
	}
}