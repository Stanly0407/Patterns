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




//теория с хорошим, но простым примером https://javanerd.ru/%D0%BF%D0%B0%D1%82%D1%82%D0%B5%D1%80%D0%BD%D1%8B-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F/%D0%BF%D0%B0%D1%82%D1%82%D0%B5%D1%80%D0%BD-%D0%B4%D0%B5%D0%BA%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80/
