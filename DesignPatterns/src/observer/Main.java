package observer;

import java.util.ArrayList;

interface Observer<T>{
    void onChanged(T t);
}

class LiveData<T>{

    private T mValue;
    private ArrayList<Observer> mObservers = new ArrayList<>();

    LiveData(){
        this(null);
    }

    LiveData(T t){
        this.mValue = t;
    }

    void observe(Observer<T> observer){
        mObservers.add(observer);
    }

    void postValue(T t){
        if(!mValue.equals(t)){
            mValue = t;
            notifyObservers();
        }
    }

    private void notifyObservers(){
        for(Observer o:mObservers){
            o.onChanged(mValue);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        LiveData<String> liveData = new LiveData<>("hhhh");
        liveData.observe(new Observer<String>() {
            @Override
            public void onChanged(String s) {
                System.out.println("onChanged: "+s);
            }
        });

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    liveData.postValue("aaaaa");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
