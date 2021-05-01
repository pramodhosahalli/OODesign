package mock.design;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSystem {

	private int noOfLevels;
	private Map<Integer, Map<SlotSize, Integer>> totalSlots; // level wise
	private Map<Integer, Map<SlotSize, Integer>> filledSlots; // filled level wise
	private Map<Integer, ParkingSlot> parkingSlots; // list of parking slots

	public ParkingSystem(int noOfLevels, Map<Integer, Map<SlotSize, Integer>> totalSlots,
			List<ParkingSlot> parkingSlots) {
		this.noOfLevels = noOfLevels;
		this.totalSlots = totalSlots;
		this.filledSlots = new HashMap<>();

		for (ParkingSlot slot : parkingSlots)
			this.parkingSlots.put(slot.getSlotNo(), slot);
	}

	public boolean isSlotAvailable(int noOfSlots, SlotSize slotSize) {
		return true;
	}
	
	public ParkingSlot grantSlot(Vehicle vehicle)
	{
		if(!isSlotAvailable(vehicle.getSlotsNeeded(), vehicle.getSlotSize()))
			return null;
		return null;
	}
	
	public boolean parkVehicle(Vehicle vehicle) {
		//provide implementation here
		return true;
	}

	public boolean clearVehicle(Vehicle vehicle) {
		//provide implementation here
		return true;
	}

	public SlotStatus getSlotStatus(final int slotNo) {
		return parkingSlots.get(slotNo).getSlotStatus();
	}
}
