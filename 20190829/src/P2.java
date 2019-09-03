public class P2 {

	public static void main(String[] args) {
		hi a = new hi();
		a.name = "12";
		a.age = 12;
		a.print();
		
		hi b = new hi();
		b.name = "12";
		b.age = 12;
		b.print();
		
		hi c = new hi();
		c.name = "12";
		c.age = 12;
		c.print();
		
		hi d = new hi();
		d.name = "12";
		d.age = 12;
		d.print();
		
		hi e = new hi();
		e.name = "12";
		e.age = 12;
		e.print();
		
		hi f = new hi();
		f.name = "12";
		f.age = 12;
		f.print();
	}
}

class hi
{
	String name;
	int age;
	
	void print()
	{
		System.out.println(name + " " + age);
	}
}