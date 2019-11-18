/*
Name: Sean Styer
Date: 5/1/19
Title: Minus.java
Description: An extension of Binop in which the operator is subtraction
*/
public class Minus extends Binop{
	int depth;
	public Minus() {
		depth = super.depth;
	}
	public Minus(Node l, Node r) {
		//save the two Nodes
		super(l, r);
		depth = super.depth + 1;
	}
	public double eval(double [] data) {
		//subtract the second node from the first node
		return lChild.eval(data) - rChild.eval(data);
	}
	public String toString() {
		//return the subtraction problem computed by the eval method as a string
		return "(" + lChild.toString() + " - " + rChild.toString() + ")";
	}
}
