public class Test2{
	public static void main(String[]	args){
		//����DebitAccount����󣬾�������super()������Account��Ĺ��췽���������ᴴ��Account�����
		DebitAccount a=new DebitAccount();
		DebitAccount b=new DebitAccount("002",100.0,50);
		System.out.println(a.getName());
		System.out.println(a.getYue());
		System.out.println(a.getDebit());
		System.out.println(b.getName());
		System.out.println(b.getYue());
		System.out.println(b.getDebit());
	}
}