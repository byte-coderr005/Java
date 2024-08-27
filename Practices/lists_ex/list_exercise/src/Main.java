
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //Bir liste olusturun. Olusturdugunuz listeye arabalar ekleyin.
        List<String> arrList = new ArrayList<>();
        arrList.add("bmw");
        arrList.add("mclaren");
        arrList.add("ferrari");
        arrList.add("koenigsegg");
        arrList.add("aston_martin");
        //arrlist eleman cıkar
        String bmw = arrList.get(0);
        arrList.remove(0);
        System.out.println(arrList.size());     
        //Listeyi donme 1
        for(int i = 0; i<arrList.size(); i++){
            System.out.println(arrList.get(i));
        }
        //Listeyi donme 2
        for(String cars : arrList){
            System.out.println(cars);
        }
        //Lıste bosmu degil mi
        boolean listEmpty = arrList.isEmpty();
        System.out.println(listEmpty);
    }
}
