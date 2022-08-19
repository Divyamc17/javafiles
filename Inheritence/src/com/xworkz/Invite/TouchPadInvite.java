package com.xworkz.Invite;

import com.xworkz.subclass.TouchPadKeyBoard;
import com.xworkz.superclass.KeyBoard;

public class TouchPadInvite {

	public static void main(String[] args) {
		TouchPadKeyBoard touchpadkeyboard=new TouchPadKeyBoard(26,15,20,5,9,9);
		touchpadkeyboard.torisu();
		
		KeyBoard keyboard=new TouchPadKeyBoard(26,15,20);
		TouchPadKeyBoard number=(TouchPadKeyBoard)keyboard;
		number.torisu();
		
		KeyBoard keyboard1=new TouchPadKeyBoard(26,15,20,5,9,9);
		TouchPadKeyBoard convert=(TouchPadKeyBoard)keyboard1;
		convert.torisu();
		
		
	}

}

