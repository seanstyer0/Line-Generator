import java.util.Random;

/*
Name: Sean Styer
Date: 5/1/19
Title: Binop.java
Description: An extension of node that stores two Node objects
*/
public class Binop extends Node{
	protected Node lChild, rChild;
	public Binop() {
	}
	public Binop(Node l, Node r) {
	//store the two parameters as a left-child and a right-child
	lChild = l; rChild = r;
	}
	//return 99 to represent an error
	public double eval(double [] data) {
		return 0;
	}
	//return a string that signals that an error occurred
	public String toString() {
		return "Error";
	}
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {
		if(this.depth == maxDepth) {
			lChild = t.getTerminal(rand);
			rChild = t.getTerminal(rand);
		}
		else {
			int lChildChoice = rand.nextInt(o.getNumOps()+t.getNumIndepVars());
			if(lChildChoice < o.getNumOps()) {
				lChild = o.getOperator(rand);
				lChild.depth = this.depth + 1;	
			}
			else {
				lChild = t.getTerminal(rand);
				lChild.depth = this.depth + 1;
			}
			int rChildChoice = rand.nextInt(o.getNumOps()+t.getNumIndepVars());
			if(rChildChoice < o.getNumOps()) {
				rChild = o.getOperator(rand);
				rChild.depth = this.depth + 1;
			}
			else {
				rChild = t.getTerminal(rand);
				rChild.depth = this.depth + 1;
			}
			lChild.addRandomKids(o,t,maxDepth,rand);
			rChild.addRandomKids(o, t, maxDepth, rand);
		}
	}
}
