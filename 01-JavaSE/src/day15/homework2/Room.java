package day15.homework2;

/*
	酒店房间
 */
public class Room {
	private int roomNo;
	private String roomType;
	private boolean isFree;

	public Room() {
	}

	public Room(int roomNo, String roomType, boolean isFree) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.isFree = isFree;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean free) {
		isFree = free;
	}

	@Override
	public String toString() {
		return "[" + roomNo + "，" + roomType + "，" + (isFree ? "空闲" : "占用") + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || !(o instanceof Room)) return false;
		Room room = (Room) o;
		return roomNo == room.roomNo;
	}
	
}
