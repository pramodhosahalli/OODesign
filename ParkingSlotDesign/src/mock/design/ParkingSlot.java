package mock.design;

public class ParkingSlot {

	private int slotNo;
	private SlotSize slotSize;
	private int level;
	private int row;
	private SlotStatus slotStatus;

	public ParkingSlot(int slotNo, SlotSize slotSize, int level, int row) {
		this.slotNo = slotNo;
		this.slotSize = slotSize;
		this.level = level;
		this.row = row;
		slotStatus = SlotStatus.AVAILABLE;
	}

	public int getSlotNo() {
		return slotNo;
	}

	public SlotSize getSlotSize() {
		return slotSize;
	}

	public int getLevel() {
		return level;
	}

	public int getRow() {
		return row;
	}

	public SlotStatus getSlotStatus() {
		return slotStatus;
	}
	
}
