	package Constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Human human1 = new Human("Rick",65,70);
        Human human2 = new Human("Wyman",90,100);
        
        System.out.println(human1.name);
        
        System.out.println(human2.name);
        
        human2.eat();
	}

}
