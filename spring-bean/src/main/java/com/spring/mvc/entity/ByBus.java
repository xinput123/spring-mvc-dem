package com.spring.mvc.entity;

public class ByBus {

    private BuyTicket buyTicket;

    public BuyTicket getBuyTicket() {
        return buyTicket;
    }

    public void setBuyTicket(BuyTicket buyTicket) {
        this.buyTicket = buyTicket;
    }

    public void takeBus() {
        String myTicket = this.getBuyTicket().getTicket();
        if (myTicket.equals("ticket")) {
            System.out.println("乘车");
        }
    }
}
