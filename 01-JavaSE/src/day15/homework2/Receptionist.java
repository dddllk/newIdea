package day15.homework2;

public class Receptionist implements Function{

	Room[][] rooms;

	public Receptionist() {
	}

	public Receptionist(Room[][] rooms) {
		this.rooms = rooms;
	}

	public boolean Order(int roomNo) {
		Room room = rooms[roomNo/100-1][roomNo%100-1];
		room.setFree(false);
		return room.isFree();
	}
	public boolean Unsubscribe(int roomNo) {
		Room room = rooms[roomNo/100-1][roomNo%100-1];
		room.setFree(true);
		return room.isFree();
	}
}
