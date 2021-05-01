package mock.design;

public class MotorCycle extends Vehicle {

	MotorCycle(int vehicleNo) {
		super(VehicleSize.TWO_WHEELER, 1, vehicleNo, SlotSize.ANY);
	}

}
