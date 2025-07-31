package friday11apr;

import saturday11apr.MainSaturday;

public class MainFriday extends MainSaturday {

	public static void main(String[] args) 
	
	{
		MainSaturday obj = new MainSaturday();	
		
			MainSaturday.print();
			
			MainFriday.print();
			
//			MainSaturday.a;           project change nothing calls private. protected, default
			
			obj.printN();

	}

}
