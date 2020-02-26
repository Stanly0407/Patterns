package Decorator1;

public abstract class  BaseService {
    String nameService = "Base Service";

    public String getNameService() {
        return nameService;
    }

    public abstract int getPrice(); //для подсчета окончательной стоимости услуги (вместе с доп.услугами)

}
