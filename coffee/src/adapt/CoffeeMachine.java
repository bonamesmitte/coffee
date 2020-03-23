
package adapt;


public class CoffeeMachine {
	public static void main(String[] args) {
		CoffeeTouchscreenAdapter touchAdapter = new CoffeeTouchscreenAdapter();
	
		touchAdapter.chooseFirstSelection();
		touchAdapter.chooseSecondSelection();
				
	}
}
	 
//CoffeeMachineInterface.java

interface CoffeeMachineInterface {
	String chooseFirstSelection();
	String chooseSecondSelection();
}


//CoffeeTouchscreenAdapter.java

class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	OldCoffeeMachine theMachine;
	
	   private static final String A = null;
		private static final String B = null;

		public String selectA() {
		   return A;
		}
		
		public String selectB() {

			return B;
		}
			
	
	
	CoffeeTouchscreenAdapter(){
		theMachine = new OldCoffeeMachine();
	}
	

	//override


	  @Override
		public String chooseFirstSelection() {
			return theMachine.selectA();
		}
		
	  @Override
		public String chooseSecondSelection() {
			return theMachine.selectB();
	  }
		
	}



//OldCoffeeMachine.java

public class OldCoffeeMachine {
	

  private static final String A = null;
	private static final String B = null;

	public String selectA() {
	   return A;
	}
	
	public String selectB() {

		return B;
	}
		
}


