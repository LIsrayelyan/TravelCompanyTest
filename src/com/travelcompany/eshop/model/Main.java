package com.travelcompany.eshop.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

        public class Main {
            public static void main(String[] args) {
                Customer MariaIordanou =new Customer();
                MariaIordanou.setCategory INDIVIDUAL;
                MariaIordanou.setCost(new BigDecimal("360"));
                MariaIordanou.setpay("cash, individual");

                System.out.println(MariaIordanou);

                Customer DimitriouDimitrios =new Customer();
                DimitriouDimitrios.setCategory INDIVIDUAL1;
                DimitriouDimitrios.setCost(new BigDecimal("504"));
                DimitriouDimitrios.setpay("cash, individual");

                System.out.println(DimitriouDimitrios);

                Customer IoannisIoannou =new Customer();
                IoannisIoannou.setCategory BUSINESS;
                IoannisIoannou.setCost(new BigDecimal("226.8"));
                IoannisIoannou.setpay("card, BUSINESS");

                System.out.println(IoannisIoannou);

                Customer AntonioMolinari =new Customer();
                AntonioMolinari.setCategory INDIVIDUAL2;
                AntonioMolinari.setCost(new BigDecimal("334.8"));
                AntonioMolinari.setpay("card, individual");

                System.out.println(AntonioMolinari);

                Customer FredericoRosi =new Customer();
                FredericoRosi.setCategory INDIVIDUAL3;
                FredericoRosi.setCost(new BigDecimal("1056"));
                FredericoRosi.setpay("cash, individual");

                System.out.println(FredericoRosi);

                Customer MarioConti =new Customer();
                MarioConti.setCategory BUSINESS1;
                MarioConti.setCost(new BigDecimal("304"));
                MarioConti.setpay("card, business");

                System.out.println(MarioConti);

                Customer NathanMartin =new Customer();
                NathanMartin.setCategory BUSINESS2;
                NathanMartin.setCost(new BigDecimal("280"));
                NathanMartin.setpay("card, business");

                System.out.println(NathanMartin);

                Customer EnzoCollin =new Customer();
                EnzoCollin.setCategory INDIVIDUAL4;
                EnzoCollin.setCost(new BigDecimal("1224"));
                EnzoCollin.setpay("cash, individual");

                System.out.println(EnzoCollin);

                Customer FredericMichel =new Customer();
                FredericMichel.setCategory INDIVIDUAL5;
                FredericMichel.setCost(new BigDecimal("924"));
                FredericMichel.setpay("cash, individual");

                System.out.println(FredericMichel);
    }
}
