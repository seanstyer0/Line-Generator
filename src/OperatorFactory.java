import java.util.Random;

public class OperatorFactory {

	private Node[] currentOps;
	int depth;
	OperatorFactory(Node[] operators) {
		currentOps = new Node[operators.length];
		for(int i = 0; i < operators.length; i++)
			currentOps[i] = operators[i];
	}
	public Node getOperator(Random rand) {		
		int randOperator = rand.nextInt(currentOps.length);
		
		return (Binop)(currentOps[randOperator].clone());
		
	}
	public int getNumOps() {
		return currentOps.length;
	}
}
