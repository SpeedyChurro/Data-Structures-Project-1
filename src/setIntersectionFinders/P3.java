package setIntersectionFinders;

import java.util.ArrayList;

import interfaces.MySet;
import mySetImplementations.Set2;

public class P3 extends AbstractIntersectionFinder{

	ArrayList<Integer> allElements;

	
	public P3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MySet intersectSets(MySet[] t) {
		allElements.sort(null);
		MySet<Integer> t1 = new Set2<>(); 
		Integer e = allElements.get(0);
		Integer c = 1;
		for (int i=1; i<=allElements.size(); i++) {
		      if (i < allElements.size() && allElements.get(i).equals(e)) 
		          c++;
		      else { 
		        
				Integer m = null;
				if (c == m) 
		             t1.add(e);    // m is as in the previous discussion
		          e = allElements.get(i); 
		          c = 1; 
		      } 
		}// TODO Auto-generated method stub
		return null;
	}
	
	

}
