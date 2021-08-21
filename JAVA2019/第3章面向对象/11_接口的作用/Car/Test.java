public class Test{
	public static void main(String[] args){
		//生产引擎
		Engine e = new YAMAHA();//多态
		//生产汽车
		Car c = new Car(e);
		//测试引擎
		c.testEngine();
		//换鸿达
		c.e = new HONGDA();
		c.testEngine();
	}
}