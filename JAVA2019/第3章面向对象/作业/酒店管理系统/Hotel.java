//酒店类型
public class Hotel{
	String name;//酒店名字
	Room[][] rooms;//房间
	//构造方法
	Hotel(String name){//房间名称，默认5层，每层十个房间
		this(5,10);
		this.name=name;
	}
	Hotel(int rows,int lines){//层数 每层房间数
		rooms=new Room[rows][lines];
		for(int i=0;i<rows;i++){
			for(int j=0;j<lines;j++){
				rooms[i][j]=new Room();
			}
		}
	}
	//成员方法1：酒店房间类型、号码编排
	public void initialize(){
		//1,2层是标准间,3,4层是双人间，5层是豪华间
		for(int i=0;i<rooms.length;i++){
			for(int j=0;j<rooms[i].length;j++){
				rooms[i][j].num=100*(i+1)+j+1;//编号
				if(i<2){
					rooms[i][j].type="标准间";//1 2层
				}else if(i<4){
					rooms[i][j].type="双人间";//3 4层
				}else{
					rooms[i][j].type="豪华间";//3 4层
				}
			}
		}		
	}
	//成员方法2：预定房间
	public void order(int no){
		int i=no/100-1;
		int j=no-(i+1)*100-1;
		if((((0<=i)&&(i<=4))&&(0<=j))&&(j<=9)){
			if(rooms[i][j].isUse==false){
				System.out.println("您所选的房间已被占用，请重新选择！");
			}else if(rooms[i][j].isUse==true){
				rooms[i][j].isUse=false;
				System.out.println("恭喜您预定成功！");
			}
		}else{
			System.out.println("输入数字错误，请输入数字101~510！");
		}
	}
	//成员方法3：退订房间
	public void unsubscribe(int no){
		int i=no/100-1;
		int j=no-(i+1)*100-1;
		if((((0<=i)&&(i<=4))&&(0<=j))&&(j<=9)){
			if(rooms[i][j].isUse==false){
				rooms[i][j].isUse=true;
				System.out.println("恭喜您退订成功！");
			}else if(rooms[i][j].isUse==true){
				System.out.println("您所选的房间无人入住，请重新选择！");
			}
		}else{
			System.out.println("输入数字错误，请输入数字101~510！");
		}
	}
	//成员方法4：展示所有房间状态
	public void show(){
		System.out.println("本酒店1,2层是标准间,3,4层是双人间，5层是豪华间！");
		System.out.println("1代表可预定房间，0代表已被预定！");
		for(int i=0;i<rooms.length;i++){
			System.out.println("第"+(i+1)+"层:");
			for(int j=0;j<rooms[i].length;j++){
				String c=((rooms[i][j]).isUse)?"1 ":"0 ";
				System.out.print(c);//1代表可以用，0代表不可用
			}
			System.out.println();
		}
	}	
}