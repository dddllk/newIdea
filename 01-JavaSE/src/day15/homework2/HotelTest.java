package day15.homework2;

import java.util.Scanner;

public class HotelTest {
	public static void main(String[] args) {
		System.out.println("欢迎使用酒店管理系统：");
		// 创建酒店对象
		Hotel hotel = new Hotel();
		hotel.BuildHotel();
		System.out.println("当前酒店的房间状态为：");
		hotel.printRoom();

		// 员工获取酒店房间
		Function f = new Receptionist(hotel.getRooms());
		// 顾客预订酒店房间
		Customer c = new Customer(f);
		
		while(true) {
			// 预订房间
			System.out.print("请输入您要预订的房间号：" );
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			if(!c.order(no)) {
				System.out.println("您要预订的房间编号为：" + no);
				System.out.println("确认请按1，返回请按0：");
				int num = sc.nextInt();
				if(num == 1) System.out.println("恭喜您预订" + no + "房间成功！");
				if(num == 0) return;
			}else{
				System.out.println("当前房间为预订状态，无需预订");
			}
			//打印当前房间状态
			System.out.println("当前酒店房间状态为：");
			hotel.printRoom();
			//退订房间
			System.out.print("请输入您要退订的房间号：" );
			int no1 = sc.nextInt();
			if(!c.unsubscribe(no1)) {
				System.out.println("恭喜您退订" + no1 + "房间成功！");
			}else {
				System.out.println("当前房间"+ no1 + "为空闲状态，无需退订");
			}

			System.out.println("当前酒店房间状态为：");
			hotel.printRoom();

		}
	}
}
