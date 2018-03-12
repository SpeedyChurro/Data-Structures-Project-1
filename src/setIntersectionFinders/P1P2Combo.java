package setIntersectionFinders;

import interfaces.MySet;
import mySetImplementations.Set1;
import dataGenerator.DataReader;

import java.io.FileNotFoundException;
import java.util.Iterator;

public class P1P2Combo extends AbstractIntersectionFinder {

	Object[][] dataFiles;
	

	public P1P2Combo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MySet intersectSets(MySet[] t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] setGenerator(Object [][][] dataSet) throws FileNotFoundException {
		
		dataFiles = new Object[dataSet.length][dataSet[0].length];
		for (int i = 0; i < dataSet.length; i++)
		{
			for(int j = 0; j < dataSet[0].length; j++)
			{
				dataFiles[i][j] = new Set1<Integer>();
				  for (int k = 0; k < dataSet[i][j].length; k++)
				  {
					 // Set1<Integer> dataSet = dataFiles[j].add(dataSet[i][j][k]); 
				  }
			}
		}
		
		return null;

	}
}
