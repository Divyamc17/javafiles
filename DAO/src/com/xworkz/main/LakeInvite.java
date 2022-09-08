package com.xworkz.main;

import com.xworkz.dao.LakeDAOImpl;

public class LakeInvite {

	public static void main(String[] args) {
	
		LakeDAOImpl impl = new LakeDAOImpl();
		impl.save("ulsoor lake");
		impl.save("bellandur lake");
		impl.save("btm lake");
		impl.save("sankey tank lake");
		impl.save("agra lake");
		impl.save("hebbal lake");
		impl.save("halsur lake");
		impl.save("Lalbagh lake");
		impl.save("madiwala lake");
		impl.save("nagavara lake");
		impl.printAllLakes();

	}

}
