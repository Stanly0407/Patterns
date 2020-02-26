package Decorator1;

public class Service_1 extends BaseService {

    public Service_1() {
        nameService = "Written translation (English)";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
