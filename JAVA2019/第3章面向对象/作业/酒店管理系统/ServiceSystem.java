import java.util.Scanner;
public class ServiceSystem{
	public static void main(String[] args){
		Hotel a=new Hotel("猫大王");//创建“猫大王酒店”
		a.initialize();//初始化酒店
		printmenu(a);//提供服务菜单
		boolean open=true;
		while(open){
			Scanner s=new Scanner(System.in);
			Integer choice = Integer.parseInt(s.next());
			switch(choice){
				case 1:
					System.out.println("==================");
					a.show();
					System.out.println("==================");
					System.out.println("请重新选择服务：");
					break;
				case 2:
					System.out.println("==================");
					System.out.println("请输入您要预定的房间号码：（101~510）");
					Scanner x=new Scanner(System.in);
					Integer no = Integer.parseInt(x.next());
					a.order(no);
					System.out.println("==================");
					System.out.println("请重新选择服务：");
					break;
				case 3:
					System.out.println("==================");
					System.out.println("请输入您要退订的房间号码：（101~510）");
					Scanner y=new Scanner(System.in);
					Integer no2 = Integer.parseInt(y.next());
					a.unsubscribe(no2);
					System.out.println("==================");
					System.out.println("请重新选择服务：");
					break;
				case 4:
					System.out.println("==================");
					System.out.println("谢谢惠顾！");
					open=false;
					break;
				default:
					System.out.println("输入数字错误，请输入数字1~4！");
					break;
			}
		}
	}
	public static void printmenu(Hotel a){
		System.out.println("欢迎来到"+a.name+"酒店!");
		System.out.println("您可选择以下服务：");
		System.out.println("==================");
		System.out.println("1.查看房间");
		System.out.println("2.预定房间");
		System.out.println("3.退订房间");
		System.out.println("4.退出系统");
	}
}