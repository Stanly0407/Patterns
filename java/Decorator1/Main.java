package Decorator1;

public class Main {
    public static void main(String[] args) {
        BaseService BaseService1 = new Service_1();
        System.out.print(BaseService1.getNameService() + ": ");
        System.out.println(BaseService1.getPrice() + " BYN.");

        BaseService1 = new MoreQuantity(BaseService1);
        System.out.print(BaseService1.getNameService() + ": ");
        System.out.println(BaseService1.getPrice() + " BYN.");

        BaseService1 = new NotaryCertification(BaseService1);
        System.out.print(BaseService1.getNameService() + ": ");
        System.out.println(BaseService1.getPrice() + " BYN.");

        BaseService BaseService789 = new Service_2();
        System.out.print(BaseService789.getNameService() + ": ");
        System.out.println(BaseService789.getPrice() + " BYN.");

        BaseService789 = new NotaryCertification(BaseService789);
        System.out.print(BaseService789.getNameService() + ": ");
        System.out.println(BaseService789.getPrice() + " BYN.");

    }
}
