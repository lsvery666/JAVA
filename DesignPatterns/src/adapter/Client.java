package adapter;

// 客户想要一只会喵喵叫的猫，但是没有猫的实现类，只有狗的实现类
// 让狗假扮成猫 狗是Adaptee（适配者类） 猫是Taret（目标抽象类） CatAdapter是Adapter（适配器类）
public class Client {

    public static void main(String[] args) {

        Dog dog = new HaShiQi();

        // 通过适配器让狗假扮成猫
        Cat cat = new CatAdapter(dog);
        cat.miaomiao();

        Cat cat2 = new CatAdapter2();
        cat2.miaomiao();
    }
}

class HaShiQi implements Dog{

    @Override
    public void wangwang() {
        System.out.println("我是哈士奇");
    }
}

// 对象适配器模式
class CatAdapter implements Cat{
    Dog dog;

    public CatAdapter(Dog dog){
        this.dog = dog;
    }

    @Override
    public void miaomiao() {
        dog.wangwang();
    }
}

// 类适配器模式
// 一个会喵喵叫的哈士奇
class CatAdapter2 extends HaShiQi implements Cat{
    @Override
    public void miaomiao() {
        wangwang();
    }
}