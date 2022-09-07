package com.xworkz.gym;

public class KpscRule implements ExamRule {

	@Override
	public boolean compulsoryAllTicket() {
		System.out.println("without all ticket not allowed");
		return true;
	}

	@Override
	public boolean wearShoes() {
		System.out.println("wear shoes are not allowed");
		return false;
	}

	@Override
	public boolean wearArrnaments() {
		System.out.println("wearing arranaments are not allowed ");
		return true;
	}

}
