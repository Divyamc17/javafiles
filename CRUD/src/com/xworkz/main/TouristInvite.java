package com.xworkz.main;

import com.xworkz.casion.dao.TouristPlaceDAO;
import com.xworkz.casion.dao.TouristPlaceService;
import com.xworkz.impl.PlaceServiceImpl;
import com.xworkz.impl.TouristDAOImpl;
import com.xworkz.impl.TouristPlaceValidException;

public class TouristInvite {

	public static void main(String[] args) {
	
		TouristPlaceDAO tourist=new TouristDAOImpl();
		tourist.save("Mysore");
		tourist.save("KRS");
		tourist.save("Zoo");
		tourist.save("mount everest");
		tourist.save("taj mahal");
		tourist.save("Indian gate");
		tourist.save("china wall");
		tourist.save("devaramane");
		tourist.save("dood sagar");
		//tourist.save("delta beach");

		
		TouristPlaceService touristplace= new PlaceServiceImpl(tourist);
      
		try {
			touristplace.checkAndValidate("taj mahal");
		}
		catch(TouristPlaceValidException exp) {
			
		}
		
	}

}
