Requirements of ParkingSlot:

1. Should be able to park bus, car or MotorCycle
2. MotorCycle could be parked at any slot
3. Car can be parked at medium sized slots/ large Slots
4. Bus can be parked at large slot (But it needs 5 consecutive large slots)
5. Parking System should have multiple levels and in each level, we have multiple rows.


Design:

SlotSize --> SMALL, MEDIUM, LARGE, ANY (If a Vehicle can be parked at any slot)
SlotStatus --> AVAILABLE, RESERVED

Vehicle --> Involves Common Parameters of Vehicle. 
			Bus, Car and MotorCycle inherits behavior of vehicle

ParkingSlot --> Indicates a Slot. This contains level, row and SlotSize, SlotStatus Information
ParkingSystem --> Manages parking system. Grants slot for Vehicle, Provides Slot status, Allows parking and clearing
