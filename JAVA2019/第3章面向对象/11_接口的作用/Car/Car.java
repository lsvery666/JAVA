//生产汽车
public class Car{
	//引擎
	Engine e;
	//构造方法
	Car(Engine e){
		this.e = e;
	}
	//汽车应该能够测试引擎
	public void testEngine(){
		e.start();//面向接口调用
	}
}