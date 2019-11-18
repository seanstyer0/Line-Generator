/*
Name: Sean Styer
Date: 5/1/19
Title: Mult.java
Description: An extension of Binop in which the operator is multiplication
*/
public class Mult extends Binop{
	int depth;
	public Mult() {
		depth = super.depth;
	}
	public Mult(Node l, Node r) {
		//save the two Nodes
		super(l, r);
		depth = super.depth + 1;
	}
	public double eval(double [] data) {
		//multiply the two nodes
		return lChild.eval(data) * rChild.eval(data);
	}
	public String toString() {
		//return the multiplication problem computed by eval as a string
		return "(" + lChild.toString() + " * " + rChild.toString() + ")";
	}
}
