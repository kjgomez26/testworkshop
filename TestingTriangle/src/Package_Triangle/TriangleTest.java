package Package_Triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testVerificate_rangeFalse() {
		Boolean Result_final = false;
		String Result_esperate = "Value of a is not in the range of permitted values";
		Triangle triangle = new  Triangle();
		triangle.setA(0);
		triangle.setB(20);
		triangle.setC(40);
		assertEquals(Result_final, triangle.Verificate_range());
		System.out.println("Test range False");
	}
	@Test
	void testVerificate_range() {
		Boolean Result_final = true;
		String Result_esperate = "Value of a is not in the range of permitted values";
		Triangle triangle = new  Triangle();
		triangle.setA(19);
		triangle.setB(20);
		triangle.setC(40);
		assertEquals(Result_final, triangle.Verificate_range());
		System.out.println("Test range");
	}
	@Test
	void testVerificate_triangle1() {
		boolean Result_esperate = true;
		Triangle triangle = new  Triangle();
		triangle.setA(30);
		triangle.setB(20);
		triangle.setC(20);
		triangle.Verificate_range();
		triangle.Verificate_triangle();;
		assertEquals(Result_esperate, triangle.isTriangle());
		System.out.println("Test Verificate_Triangle 1");
		System.out.println("Input: (30,20,20)");
		System.out.println("Result_esperade:"+ Result_esperate);
		System.out.println("Result_final:"+triangle.isTriangle());
	}
	
	@Test
	void testVerificate_triangle2() {
		boolean Result_esperate = false;
		Triangle triangle = new  Triangle();
		triangle.setA(200);
		triangle.setB(10);
		triangle.setC(10);
		triangle.Verificate_range();
		triangle.Verificate_triangle();;
		assertEquals(Result_esperate, triangle.isTriangle());
		System.out.println("Test Verificate_Triangle 2");
		System.out.println("Input: (200,10,10)");
		System.out.println("Result_esperade:"+ Result_esperate);
		System.out.println("Result_final:"+triangle.isTriangle());
	}
	@Test
	void testDeterminate_Triangle1() {
		String Result_esperate = "Equilateral";
		Triangle triangle = new  Triangle();
		triangle.setA(20);
		triangle.setB(20);
		triangle.setC(20);
		triangle.Verificate_range();
		triangle.Verificate_triangle();
		assertEquals(Result_esperate, triangle.Determinate_Triangle());
		System.out.println("Test Determinate_Triangle 1");
		System.out.println("Input: (20,20,20)");
		System.out.println("Result_esperate: Equilateral");
		System.out.println("Result_final: "+triangle.Determinate_Triangle());
	}
	
	@Test
	void testDeterminate_Triangle2() {
		String Result_esperate = "Not a Triangle";
		Triangle triangle = new  Triangle();
		triangle.setA(30);
		triangle.setB(50);
		triangle.setC(20);
		triangle.Verificate_range();
		triangle.Verificate_triangle();
		assertEquals(Result_esperate, triangle.Determinate_Triangle());
		System.out.println("Test Determinate_Triangle 2");
		System.out.println("Input: (30,50,20)");
		System.out.println("Result_esperate: "+Result_esperate);
		System.out.println("Result_final: "+triangle.Determinate_Triangle());
	}
	
	@Test
	void testDeterminate_Triangle3() {
		String Result_esperate = "Isosceles";
		Triangle triangle = new  Triangle();
		triangle.setA(20);
		triangle.setB(10);
		triangle.setC(20);
		triangle.Verificate_range();
		triangle.Verificate_triangle();
		assertEquals(Result_esperate, triangle.Determinate_Triangle());
		System.out.println("Test Determinate_Triangle 3");
		System.out.println("Input: (20,10,20)");
		System.out.println("Result_esperate: "+Result_esperate);
		System.out.println("Result_final: "+triangle.Determinate_Triangle());
	}
	
	@Test
	void testDeterminate_Triangle4() {
		String Result_esperate = "Scalene";
		Triangle triangle = new  Triangle();
		triangle.setA(20);
		triangle.setB(15);
		triangle.setC(25);
		triangle.Verificate_range();
		triangle.Verificate_triangle();
		assertEquals(Result_esperate, triangle.Determinate_Triangle());
		System.out.println("Test Determinate_Triangle 4");
		System.out.println("Input: (20,15,25)");
		System.out.println("Result_esperate: "+Result_esperate);
		System.out.println("Result_final: "+triangle.Determinate_Triangle());
	}

}
