package coffee;

import java.util.*;

public class Coffee2 {
	
	static int flavor (int n) {
		int flavor = 0; 
		
		if (n == 0)
			flavor = 0;
		else if (n == 1)
			flavor = 1;
		else if (n == 2)
			flavor = 2;
		else 
			flavor = 3;
	    
		return flavor;
	}
		
        public static void main(String[] args) {
			System.out.println("Which coffee flavor do you want? Choose one button: 0,1,2,3 ");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt(4);
			
			switch(num) {
			case 0: System.out.println("Old A");   break;
			case 1: System.out.println("Old B");   break;
			case 2: System.out.println("New C");   break;
			case 3: System.out.println("New D");   break;
		
			}
		
		
	}

public interface CoffeeMachineInterface {
	final static String chooseFirstSelection ="oldA";
	final static String chooseSecondSelection = "oldB";

}

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	private OldCoffeeMachine oldcoffee;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
		oldcoffee = newMachine;
	}
	
	public void chooseFirstSelection() {
		oldcoffee.selectA();
	}
	
	public void chooseSecondSelection() {
		oldcoffee.selectB();

	}



public class OldCoffeeMachine {
			
			OldCoffeeMachine oldcoffee = new OldCoffeeMachine();
			
			public void selectA() {
				System.out.println("Old A - Selected");
			}
			public void selectB() {
				System.out.println("Old B - Selected");
			}
			
			
			
			
		}
		
public class NewCoffeeMachine {
			
			NewCoffeeMachine newcoffee = new NewCoffeeMachine();
			
			public void selectC() {
				System.out.println("New C - Selected");
			}
			public void selectD() {
				System.out.println("New D - Selected");
			}
		}
}
}