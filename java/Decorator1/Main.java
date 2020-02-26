package Decorator1;

import Delegation1.CompanyFeedback1;
import Delegation1.CompanyFeedback2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your order:");
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

        CompanyFeedback1 companyFeedback1 = new CompanyFeedback1();
        CompanyFeedback2 companyFeedback2 = new CompanyFeedback2();

        System.out.println( "\nPlease, estimate the quality of our services: ok / bad.");
        Scanner scanner = new Scanner(System.in);
        String actionType = scanner.nextLine();


        if (actionType.equalsIgnoreCase("ok")) {
            companyFeedback1.sendComment();
        }  else if (actionType.equalsIgnoreCase("bad")) {
            companyFeedback2.sendComment();
        } else {
            System.out.println("...incorrect response, please, restart \"Main\".");
        }

    }
}




//теория с хорошим, но простым примером https://javanerd.ru/%D0%BF%D0%B0%D1%82%D1%82%D0%B5%D1%80%D0%BD%D1%8B-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F/%D0%BF%D0%B0%D1%82%D1%82%D0%B5%D1%80%D0%BD-%D0%B4%D0%B5%D0%BA%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80/
