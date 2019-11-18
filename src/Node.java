/*
Name: Sean Styer
Date: 5/1/19
Title: Node.java
Description: Provides backbone for classes extending node
*/
import java.util.Random;
public abstract class Node implements Cloneable {
	int depth;
	public Node() {
		depth = 0;
	}
	
	public abstract double eval(double [] data);
	public abstract String toString();
	public abstract void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand);
	public Object clone() {
		Object o = null;
		try {
		o = super.clone();
		}
		catch(CloneNotSupportedException e) {
		System.out.println("SimpleClass can't clone.");
		}
		return o;
	}
}