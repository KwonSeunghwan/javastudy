package chap07.inherit_introduction;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		SuperSonicAirPlane superPlane = new SuperSonicAirPlane();
		superPlane.takeOff();
		superPlane.fly();
		superPlane.flyMode = SuperSonicAirPlane.SUPERSONIC;
		superPlane.fly();
		superPlane.flyMode = SuperSonicAirPlane.NORMAL;
		superPlane.fly();
		superPlane.land();
		

	}

}
