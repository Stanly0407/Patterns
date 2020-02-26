package Decorator1;

public class NotaryCertification extends Decorator {
    BaseService baseService;

    public NotaryCertification(BaseService baseService) {
        this.baseService = baseService;
    }

    public String getNameService() {
        return baseService.getNameService() + " (Notary certification of translation)";
    }

    @Override
    public int getPrice() {
        return baseService.getPrice() + 28;
    }
}

