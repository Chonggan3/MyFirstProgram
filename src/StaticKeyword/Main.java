package StaticKeyword;

public class Main {
	public static void main(String[] args) {
       
		//Static = modifier A single copy of a variable / method is created and shared
		//         The class owns the static member
		
		Friend friend1 = new Friend("David");
		Friend friend2 = new Friend("Calvis");
		
		Friend.displayFriends();
		
		System.out.println(Friend.numberofFriends);
	}
}
