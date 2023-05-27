package com.jdc.solid_principles.open_close;

public class OpenClosedPrinciplesDemo {

	public static void main(String[] args) {
//		HotelCharges hc = new HotelCharges();
//		double charge = hc.getCharges(new DoubleRoom());
//		System.out.println("Charges :"+charge);
		
		Room r = new MasterRoom();
		double charge = r.getHotelCharges();
		System.out.println("charges :"+charge);
		
	}
}

class HotelCharges {

//	double getCharges(Room room) {
//		
//		if(room instanceof SingleRoom) {
//			return room.getBasicCharge();
//			
//		}else if(room instanceof DoubleRoom) {
//			return room.getBasicCharge()*3;
//		}
//		return 0;
//	}
}

class Room {

	double getHotelCharges() {
		return 20;
	}
}

class SingleRoom extends Room {
	@Override
	double getHotelCharges() {
		return super.getHotelCharges();
	}
}
class DoubleRoom extends Room {
	@Override
	double getHotelCharges() {
		return super.getHotelCharges()*3;
	}
}

class MasterRoom extends Room{
	@Override
	double getHotelCharges() {
		return super.getHotelCharges()*5;
	}
}
