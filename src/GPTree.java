/*
Name: Sean Styer
Date: 5/1/19
Title: GPTree.java
Description: Building block for trees
*/
import java.util.*;
public class GPTree {
    private Node root;
    GPTree() { root = null; }
    GPTree(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {
        root = o.getOperator(rand);
        root.addRandomKids(o, t, maxDepth, rand);
    }
    public String toString() {
    	return root.toString();
	}
    
    public double eval(DataSet data) {
    	int rows = data.getNumRows();
    	double fitness = 0;
    	for(int i = 0; i < rows; i++) {
    		fitness += ((root.eval(data.getRow(i).getVarList()) - data.getRow(i).getY()) * (root.eval(data.getRow(i).getVarList()) - data.getRow(i).getY()));
    	}
    	return fitness;
	}
}