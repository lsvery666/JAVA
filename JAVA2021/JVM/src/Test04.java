import java.util.ArrayList;

/*
JProfiler
-Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 */
public class Test04 {
    byte[] array = new byte[1024*1024];

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        int count = 0;

        try{
            while(true){
                list.add(new Test04());
                count += 1;
            }
        }catch (OutOfMemoryError e){
            System.out.println(count);
            e.printStackTrace();
        }
    }

}
