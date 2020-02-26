package Decorator1;

public class MoreQuantity extends Decorator {
    BaseService baseService;

    public MoreQuantity(BaseService baseService) { //В конструкторе данного класса мы передаем объект базовых услуг;
        this.baseService = baseService;
    }

    public String getNameService() {
        return baseService.getNameService() + " (Word count >10000)"; //добавляем описание для новой опции к базовой услуге
    }

    @Override
    public int getPrice() {
        return baseService.getPrice() + 65; //добавляем цену для новой опции к базовой услуге
    }
}
