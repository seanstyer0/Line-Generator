/*
Name: Sean Styer
Date: 5/1/19
Title: TestGeneration.java
Description: Prompts the user for a data file, creates a generation of GPTrees and finds the most fit tree
*/
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class TestGeneration {
	    static int maxDepth = 5;
	    static Random rand = new Random();
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		//prompt the user for the location of a data file
		System.out.println("Enter the location of a data file:");
		String fileName = scan.nextLine();
		scan.close();
		//scan the file to find the number of variables
		FileReader input = new FileReader(fileName);
		Scanner readFile = new Scanner(input);
		int numIndepVars = readFile.nextInt();
	    readFile.close();
	    //create operator and terminal factories for the GPTrees
        Node[] ops = {new Plus(), new Minus(), new Mult(), new Divide()};
        OperatorFactory o = new OperatorFactory(ops);
        TerminalFactory t = new TerminalFactory(numIndepVars);
        //create a generation of GPTrees, find the most fit tree, and print it out
        Generation equationList = new Generation(500, o, t, maxDepth, rand);
        equationList.evalAll(new DataSet(fileName));
        equationList.printBestTree();
	}
}