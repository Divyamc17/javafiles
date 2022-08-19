package com.xworkz.Invite;

import com.xworkz.subclass.Pipe;
import com.xworkz.superclass.Plastic;

public class PipeInvite {

	public static void main(String[] args) {
		Pipe pipe=new Pipe(1.5,5.00,350.0,1900.0,45.00,135.0);
		pipe.torisu();
		
		Plastic plastic=new Pipe(1.5,5.00,350.0);
		Pipe con=(Pipe)plastic;
		con.torisu();

	}

}
