package day15.homework2;

/*
	为某个酒店编写酒店管理系统：模拟订房、退房、打印所有房间状态等功能。
	1.该系统的用户是：酒店前台
	2.酒店中所有的房间使用一个二维数组来模拟。Room[][] rooms;
	3.酒店中的每个房间应该是一个java对象：Room
	4.每一个房间Room应该有：房间编号、房间类型属性、房间是否空闲
	5.系统应该对外提供的功能：
		①预订房间：用户输入房间编号，订房
		②退订房间：用户输入房间编号，退房
		③可以查看所有房间状态：用户输入某个指令应该可以查看所有房间状态
 */
public class Hotel {
	private Room [][] rooms;

	// 无参构造
	public Hotel() {
		rooms = new Room[5][10];
	}

	// 有参构造
	public Hotel(Room[][] rooms) {
		this.rooms = rooms;
	}

	public Room[][] getRooms() {
		return rooms;
	}

	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "{}";
	}

	// 构建酒店
	public void BuildHotel() {
		for (int i = 0; i < rooms.length; i++) { // i是下标，i+1是楼层
			for (int j = 0; j < rooms[i].length; j++) { // j是下标，j+1是房间号
				switch(i) {
					case 0 : rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true); // 第1层
						break;
					case 1 : rooms[i][j] = new Room((i+1)*100+j+1,"双人间",true); // 第2层
						break;
					case 2 : rooms[i][j] = new Room((i+1)*100+j+1,"三人间",true); // 第3层
						break;
					case 3 : rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true); // 第4层
						break;
					case 4 : rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true); // 第5层
						break;
					default: rooms[i][j] = new Room((i+1)*100+j+1,"职工宿舍",false); // 第6层
				}
			}
		}
	}

	// 打印房间列表
	public void printRoom() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j]);
			}
			System.out.println();
		}
	}
}
