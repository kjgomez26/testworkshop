package Package_Triangle;

import java.util.Scanner;


public class Triangle {
	private int a, b, c;
	private boolean c1, c2, c3, isTriangle;
	
	public boolean Verificate_range(){
		setC1((1 <= getA()) && (getA() <= 200));
		setC2((1 <= getB()) && (getB() <= 200));
		setC3((1 <= getC()) && (getC() <= 200));
		
		if (!isC1()) {
			System.out.println("Value of a is not in the range of permitted values");
			return false;
		}
		if (!isC2()) {
			System.out.println("Value of b is not in the range of permitted values");
			return false;
		}
		if (!isC3()) {
			System.out.println("Value of c is not in the range of permitted values");
			return false;
		}
		return true;
	}
	
	public void Verificate_triangle() {
		if ((getA() < getB() + getC()) && (getB()< getA() + getC()) && (getC() < getA() + getB())) {
			setTriangle(true);
		} else {
			setTriangle(false);
		}
	}
	
	public String Determinate_Triangle() {
		if (isTriangle()) {
			if ((getA() == getB()) && (getB() == getC())) {
				return "Equilateral";
			}
			else if ((getA() != getB()) && (getA() != getC()) && (getB() != getC())) {
				return "Scalene";
			} 
			else {
				return "Isosceles";
			}
		} 
		else {
			return "Not a Triangle";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b,c;
		Triangle triangle=new Triangle();
		boolean inputelement=true;
		Scanner reader = new Scanner(System.in);

//		Step 1: Get Input
		do {
			System.out.println("Enter 3 integers which are sides of a triangle");
			System.out.print("a: ");
			triangle.setA( reader.nextInt());
			
			System.out.print("b: ");
			triangle.setB(reader.nextInt());
			System.out.print("c: ");
			triangle.setC(reader.nextInt());

			triangle.setC2(false);
		} while ((!triangle.Verificate_range()&&inputelement));

		reader.close();

//		Step 2: Is A Triangle?
		triangle.Verificate_triangle();

//		Step 3: Determine Triangle Type
		System.out.print(triangle.Determinate_Triangle());

	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public boolean isC1() {
		return c1;
	}
	public void setC1(boolean c1) {
		this.c1 = c1;
	}
	public boolean isC2() {
		return c2;
	}
	public void setC2(boolean c2) {
		this.c2 = c2;
	}
	public boolean isC3() {
		return c3;
	}
	public void setC3(boolean c3) {
		this.c3 = c3;
	}
	public boolean isTriangle() {
		return isTriangle;
	}
	public void setTriangle(boolean isTriangle) {
		this.isTriangle = isTriangle;
	}
	
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}

