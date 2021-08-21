//�Ƶ�����
public class Hotel{
	String name;//�Ƶ�����
	Room[][] rooms;//����
	//���췽��
	Hotel(String name){//�������ƣ�Ĭ��5�㣬ÿ��ʮ������
		this(5,10);
		this.name=name;
	}
	Hotel(int rows,int lines){//���� ÿ�㷿����
		rooms=new Room[rows][lines];
		for(int i=0;i<rows;i++){
			for(int j=0;j<lines;j++){
				rooms[i][j]=new Room();
			}
		}
	}
	//��Ա����1���Ƶ귿�����͡��������
	public void initialize(){
		//1,2���Ǳ�׼��,3,4����˫�˼䣬5���Ǻ�����
		for(int i=0;i<rooms.length;i++){
			for(int j=0;j<rooms[i].length;j++){
				rooms[i][j].num=100*(i+1)+j+1;//���
				if(i<2){
					rooms[i][j].type="��׼��";//1 2��
				}else if(i<4){
					rooms[i][j].type="˫�˼�";//3 4��
				}else{
					rooms[i][j].type="������";//3 4��
				}
			}
		}		
	}
	//��Ա����2��Ԥ������
	public void order(int no){
		int i=no/100-1;
		int j=no-(i+1)*100-1;
		if((((0<=i)&&(i<=4))&&(0<=j))&&(j<=9)){
			if(rooms[i][j].isUse==false){
				System.out.println("����ѡ�ķ����ѱ�ռ�ã�������ѡ��");
			}else if(rooms[i][j].isUse==true){
				rooms[i][j].isUse=false;
				System.out.println("��ϲ��Ԥ���ɹ���");
			}
		}else{
			System.out.println("�������ִ�������������101~510��");
		}
	}
	//��Ա����3���˶�����
	public void unsubscribe(int no){
		int i=no/100-1;
		int j=no-(i+1)*100-1;
		if((((0<=i)&&(i<=4))&&(0<=j))&&(j<=9)){
			if(rooms[i][j].isUse==false){
				rooms[i][j].isUse=true;
				System.out.println("��ϲ���˶��ɹ���");
			}else if(rooms[i][j].isUse==true){
				System.out.println("����ѡ�ķ���������ס��������ѡ��");
			}
		}else{
			System.out.println("�������ִ�������������101~510��");
		}
	}
	//��Ա����4��չʾ���з���״̬
	public void show(){
		System.out.println("���Ƶ�1,2���Ǳ�׼��,3,4����˫�˼䣬5���Ǻ����䣡");
		System.out.println("1�����Ԥ�����䣬0�����ѱ�Ԥ����");
		for(int i=0;i<rooms.length;i++){
			System.out.println("��"+(i+1)+"��:");
			for(int j=0;j<rooms[i].length;j++){
				String c=((rooms[i][j]).isUse)?"1 ":"0 ";
				System.out.print(c);//1��������ã�0��������
			}
			System.out.println();
		}
	}	
}