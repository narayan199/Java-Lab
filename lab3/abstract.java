abstract class shape
{
	abstract public void draw();
	abstract public void paint();
}
abstract class triangle extends shape
{
	public void draw()
	{
		System.out.println("Draw a triangle");
	}
}
class circle extends shape
{
	public void draw()
	{
		System.out.println("Draw a triangle");
	}
	public void paint()
	{
		System.out.println("Draw a circle");
	}
}
class Abstraction
{
	public static void main(String[] args) 
	{
		circle obj= new circle;
		obj.draw();
		obj.paint();
			
	}
}