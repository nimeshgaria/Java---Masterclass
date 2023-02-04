package com.company.Section6;

public class Main {
    public static void main(String[] args) {
      /*  Car audi = new Car();
        audi.setModel("Audi");
        System.out.println("Car is : " +audi.getModel());*/
      /*  Account account = new Account();
        account.deposit(100);
        account.withdrawl(10);
        Branch branch = new Branch("Gurgaon");
        Bankcode bankcode = new Bankcode("12318","West");*/
        VipCustomer vipCustomer1 = new VipCustomer();
        vipCustomer1.deposit(2);
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getEmailaddress());

        VipCustomer vipCustomer2 = new VipCustomer("name2", 3223);
        System.out.println(vipCustomer2.getEmailaddress());

        VipCustomer vipCustomer3 = new VipCustomer("qwe", 123, "qwe@gmail.com");
        vipCustomer3.getName();
        vipCustomer3.getEmailaddress();


    }

}
