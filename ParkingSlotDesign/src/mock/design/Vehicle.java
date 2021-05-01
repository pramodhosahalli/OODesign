package mock.design;

public abstract class Vehicle {

	private VehicleSize vehicleSize;
	private int slotsNeeded;
	private SlotSize slotSize;
	private int vehicleNo;

	Vehicle(VehicleSize vehicleSize, int slotsNeeded, int vehicleNo, SlotSize slotSize) {
		this.vehicleSize = vehicleSize;
		this.slotsNeeded = slotsNeeded;
		this.vehicleNo = vehicleNo;
		this.slotSize = slotSize;
	}

	public VehicleSize getVehicleSize() {
		return vehicleSize;
	}

	public int getSlotsNeeded() {
		return slotsNeeded;
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public SlotSize getSlotSize() {
		return slotSize;
	}	

}
