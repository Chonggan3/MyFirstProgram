package MyFirstProgram;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double x = 3.14;
        double y = -10;
        
        double z = Math.min(x, y);
        double a = Math.max(x,y);
        double b = Math.abs(y);
        double c = Math.sqrt(b);
        
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}

}
