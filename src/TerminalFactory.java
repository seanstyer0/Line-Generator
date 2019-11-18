import java.util.Random;

public class TerminalFactory {
	
	int numIndepVars;
	public TerminalFactory(int n) {
		numIndepVars = n;
	}
	
	public Node getTerminal(Random rand) {
		Node returnNode;
		int randTerminal = rand.nextInt(numIndepVars + 1);
		
		if(randTerminal < numIndepVars)
			returnNode = new Variable(randTerminal);
		else
			returnNode = new Const(rand.nextDouble());
		return returnNode;
	}
	
	public int getNumIndepVars() {
		return numIndepVars;
	}
}