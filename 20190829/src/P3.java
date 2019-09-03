public class P3 {

	public static void main(String[] args) {
		hi2 a = new hi2("12", 12);
		a.print();
		
		hi2 b = new hi2("12", 12);
		b.print();
		
		hi2 c = new hi2("12", 12);
		b.print();
		
		hi2 d = new hi2("12", 12);
		d.print();
		
		hi2 e = new hi2("12", 12);
		e.print();
		
		hi2 f = new hi2("12", 12);
		f.print();
	}
}

class hi2
{
	String name;
	int age;
	
	hi2(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void print()
	{
		System.out.println(name + " " + age);
	}
}