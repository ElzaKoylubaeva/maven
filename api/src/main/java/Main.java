import ru.koylubaevaem.db.MyEntity;
import ru.koylubaevaem.service.MyService;

public class Main {

    public static void main(String[] args) {

        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        MyEntity secondEntity = new MyEntity("second");
        System.out.println(myService.setMyEntity(secondEntity));
        System.out.println(myService.getMyEntity());
    }
}
