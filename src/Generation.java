/*
Name: Sean Styer
Date: 5/1/19
Title: Generation.java
Description: Infrastructure to perform tasks on many trees at once
*/
import java.util.*;
public class Generation {
	private int numTrees;
    private GPTree[] population;
    private double[] fitness;

    /** Specifies the number of GPTrees in this generation, the
    * factories used to generate the individual trees, the maximum tree depth,
    * and the Random object used. */
    Generation(int numTrees, OperatorFactory o, TerminalFactory t, int m, Random r) {
        this.numTrees = numTrees;
        population = new GPTree[numTrees];
        fitness = new double[numTrees];
         for (int i = 0; i < numTrees; i++)
            population[i] = new GPTree(o, t, m, r);
    }
    Generation(int n) {
        numTrees = n;
        population = new GPTree[numTrees];
        fitness = new double[numTrees];
    }


    /** Evaluate each tree in this generation, and set each tree's fitness value. */
    public void evalAll(DataSet data) {
        for(int i=0;i<numTrees;i++)
        	fitness[i] = population[i].eval(data);

    }

    public GPTree getTree(int i) {
        return population[i];
    }

    /** Prints the tree with the lowest fitness value. */
    public void printBestTree() {
    	int i=0;
        double[] tempFitness = fitness.clone(); //create a clone of fitness array in case of that its original order 
                                               //would be changed after sorting
        Arrays.sort(tempFitness);// sort the cloned array
        while(tempFitness[0]!=fitness[i]){  //find the smallest value within fitness[]
        	i++;
        }
        
        System.out.println(population[i]);
        System.out.println("The smallest fitness is "+tempFitness[0]);
    }
    public int getNumTrees() { return numTrees; }
    public void printGeneration() {
        for (int i = 0; i < numTrees; i++) {
            System.out.println(population[i]);
        }
    }
}
