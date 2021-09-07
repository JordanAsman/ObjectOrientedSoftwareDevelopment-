package hashmap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class HashMapProblemTest {
	
	private HashMap<String,ArrayList<String>> map1 = new HashMap<String,ArrayList<String>>();
	private HashMap<String,ArrayList<String>> map2 = new HashMap<String,ArrayList<String>>();
	private HashMap<String,ArrayList<String>> map3 = new HashMap<String,ArrayList<String>>();
	private HashMap<String,ArrayList<String>> map4 = new HashMap<String,ArrayList<String>>();
	
	private ArrayList<String> listA = new ArrayList<String>();
	private ArrayList<String> listB = new ArrayList<String>();
	private ArrayList<String> listC = new ArrayList<String>();
	private ArrayList<String> listD = new ArrayList<String>();
	private ArrayList<String> listE = new ArrayList<String>();
	private ArrayList<String> listBC = new ArrayList<String>();
	private ArrayList<String> listCDE = new ArrayList<String>();
	private ArrayList<String> listEDF = new ArrayList<String>();
	
	
	@Before
	public void setUp() {
		listA.add("A");
		listB.add("B");
		listC.add("C");
		listD.add("D");
		listE.add("E");
		listBC.add("B");  listBC.add("C");
		listCDE.add("C"); listCDE.add("D"); listCDE.add("E");
		listEDF.add("E"); listEDF.add("D"); listEDF.add("F");
		
		//C has most
		map1.put( "W", listA     );
		map1.put( "X", listBC    );
		map1.put( "Y", listCDE   );
		
		//A has most
		map2.put( "W", listEDF  );
		map2.put( "X", listBC   );
		map2.put( "Y", listCDE  );
		map2.put( "A", listA    );
		map2.put( "B", listA    );
		map2.put( "C", listA    );
		
		//E has most
		map3.put( "C", listEDF   );
		map3.put( "A", listBC    );
		map3.put( "B", listCDE   );
		map3.put( "E", listA     );
		map3.put( "F", listE     );
		
		//D has most
		map4.put( "A", listEDF   );
		map4.put( "B", listBC    );
		map4.put( "C", listCDE   );
		map4.put( "D", listA     );
		map4.put( "E", listA     );
		map4.put( "F", listEDF     );
		map4.put( "G", listCDE     );
		map4.put( "H", listBC     );
		map4.put( "I", listD     );
		map4.put( "J", listD     );
		
		
		
		
		
	}
	
	
	@Test
	public void testFindMostInfluential() {
		
		assertEquals("C", HashMapProblem.findMostInfluential(map1));
		
		assertEquals("A", HashMapProblem.findMostInfluential(map2));
		
		assertEquals("E", HashMapProblem.findMostInfluential(map3));
		
		assertEquals("D", HashMapProblem.findMostInfluential(map4));
		
	}	
	


	
}
