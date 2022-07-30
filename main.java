package main;

interface animal{
	public void animalsound();
	public void sleep();
}
class Pig implements animal{
	public void animalsound() {System.out.println("The pig say :WEE WEE");}
	
		public void sleep();
		{System.out.println("zzz");}
	}

class main {
	
	public static void main(String[] args) {
		
		Pig mypig = new Pig();
		mypig.animalsound();
		mypig.sleep();
	
}
}
