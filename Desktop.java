package Org.system;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		
		System.out.println("Destop Size - 12 inch");
	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
		

	}

}
