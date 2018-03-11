package setIntersectionFinders;

import interfaces.MySet;
import mySetImplementations.Set1;
import dataGenerator.DataReader;

import java.io.FileNotFoundException;
import java.util.Iterator;

public class P1P2Combo extends AbstractIntersectionFinder {

	Object[][][] dataPack;
	

	public P1P2Combo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MySet intersectSets(MySet[] t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] setGenerator() throws FileNotFoundException {
		
		DataReader dataReader = new DataReader();
	    dataPack = dataReader.readDataFiles();
		
		return dataPack;

	}
}
