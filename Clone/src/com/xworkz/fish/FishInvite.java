package com.xworkz.fish;

import com.xworkz.fishclass.Fish;

public class FishInvite {

	public static void main(String[] args) {
		Fish fish=new Fish("StarFish","SeaWater");
		String check=fish.toString();
        System.out.println(check);
        //System.out.println(fish); implicit
        System.out.println(fish.getBreed());
        System.out.println(fish.getType());
        
        Fish fish2=new Fish("StarFish","SeaWater");
        fish2=fish;
        boolean find=fish2.equals(fish);
        System.out.println(find);
        System.out.println(fish.getBreed());
        System.out.println(fish.getType());
       
	}

}
