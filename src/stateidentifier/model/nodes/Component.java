package stateidentifier.model.nodes;

import java.util.List;


public class Component  implements Comparable<Component> {

	private List<State> states ;	
	
	
	public boolean isHomogeneous() {
		// TODO :
		return false;
	}

	public int size() {
		// TODO :
		return 0;
	}
	
	public Component getChildComponent(boolean input)
	{
		//TODO :
		return null;
	}
	
	private boolean addState(State state)
	{
		// TODO:
		return false;
		
	}
	
	public List<Boolean> getOutput()
	{
		//TODO :
		return null;
	}
	@Override
	public String toString() {
		
		
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	@Override
	public int compareTo(Component arg0) {
		return toString().compareTo(arg0.toString());
	} 
	
	}
