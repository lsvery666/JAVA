//使用BufferedReader对FileReader中的close方法进行扩展
//1.装饰者模式中要求：装饰者中含有被装饰者的引用
//2.装饰者模式中要求：装饰者和被装饰者应该实现同一个类型
public class BufferedReader extends Reader//BufferedReader 装饰者
{
	//关联关系
	//FileReader reader;//FileReader就是被装饰者
	Reader reader;
	BufferedReader(Reader reader){
		this.reader=reader;
	}
	public void close(){
		System.out.println("扩展代码1");
		reader.close();
		System.out.println("扩展代码2");
	}
}