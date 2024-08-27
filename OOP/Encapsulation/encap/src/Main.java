public class Main {
    public static void main(String[] args) {
    //Java da encapsulation ilkesi gereği, sınıf özellikleri genellikle 'private' olarak tanımlanır ve bu özzellik
    //lere erişmek veya değer atamak için getter ve setter yöntemleri kullanılır.
        Person p1 = new Person();
        p1.setName("Alice");
        p1.setAge(24);
        p1.write();
    }
}