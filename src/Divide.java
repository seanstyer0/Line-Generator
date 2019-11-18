/*
Name: Sean Styer
Date: 5/1/19
Title: Divide.java
Description: An extension of Binop in which the operator is division
*/
public class Divide extends Binop{
	public Divide() {
	}
	public Divide(Node l, Node r) {
		//save the two Nodes
		super(l, r);
	}
	public double eval(double [] data) {
		//divide the first node by the second
		if(rChild.eval(data) < 0.0001)
			return lChild.eval(data)/1.0;
		else
		return lChild.eval(data) / rChild.eval(data);
	}
	public String toString() {
		//return the division problem computed by eval as a string
		return "(" + lChild.toString() + " / " + rChild.toString() + ")";
	}
}
