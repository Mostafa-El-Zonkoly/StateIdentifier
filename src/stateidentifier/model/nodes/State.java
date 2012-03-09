package stateidentifier.model.nodes;

public class State {
	
	private String name;
	private State left,right;
	private boolean leftOP , rightOP;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return String.format("[%s]", name);
	}
	
	public State getChild (boolean input)
	{
		return (input) ? right : left ;
		
	}

	
	public boolean getOP (boolean input)
	{
		return (input) ? rightOP : leftOP ;
	}

	
	

}
