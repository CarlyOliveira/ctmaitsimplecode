package main.java.complexidadeciclomatica;

import java.math.BigDecimal;

public class ComplexidadeCiclomatica {

    public static void main(String[] args) {
        var price = BigDecimal.valueOf(Math.random());
        System.out.println(price);
        System.out.println(canBuy(TICKET.PREMIUM, price));
        System.out.println(canBuy1(TICKET.PREMIUM, price));
        System.out.println(TICKET.PREMIUM.canBuy(price));
    }

    private enum TICKET {
        LOW(BigDecimal.valueOf(0.10)) {
            @Override
            public boolean canBuy(BigDecimal value) {
                return this.getPrice().compareTo(value) <= 0;
            }
        }, 
        MEDIUM(BigDecimal.valueOf(0.20)) {
            @Override
            public boolean canBuy(BigDecimal value) {
                return this.getPrice().compareTo(value) <= 0;
            }
        }, 
        VIP(BigDecimal.valueOf(0.40)) {
            @Override
            public boolean canBuy(BigDecimal value) {
                return this.getPrice().compareTo(value) <= 0;
            }
        }, 
        PREMIUM(BigDecimal.valueOf(0.70)) {
            @Override
            public boolean canBuy(BigDecimal value) {
                return this.getPrice().compareTo(value) <= 0;
            }
        };

        private BigDecimal price;

        TICKET(BigDecimal price){
            this.price = price;
        }

        public BigDecimal getPrice() {
            return price;
        }
        public abstract boolean canBuy(BigDecimal value);
    } 

    public static boolean canBuy(TICKET ticket, BigDecimal  price){

        if(TICKET.LOW.equals(ticket)){
            if(price.compareTo(BigDecimal.valueOf(0.10)) >= 0){
                return true;
            }else{
                return false;
            }
        }else if (TICKET.MEDIUM.equals(ticket)) {
            if(price.compareTo(BigDecimal.valueOf(0.20)) >= 0){
                return true;
            }else{
                return false;
            }
        }else if (TICKET.VIP.equals(ticket)) {
            if(price.compareTo(BigDecimal.valueOf(0.40)) >= 0){
                return true;
            }else{
                return false;
            }
        }else{
            if(price.compareTo(BigDecimal.valueOf(0.70)) >= 0){
                return true;
            }else{
                return false;
            }
        }

    }

    public static boolean canBuy1(TICKET ticket, BigDecimal  price){

        if(TICKET.LOW.equals(ticket)){
            return price.compareTo(BigDecimal.valueOf(0.10)) >= 0;
        }
        
        if (TICKET.MEDIUM.equals(ticket)) {
            return price.compareTo(BigDecimal.valueOf(0.20)) >= 0;
        }
        
        if (TICKET.VIP.equals(ticket)) {
            return price.compareTo(BigDecimal.valueOf(0.40)) >= 0;
        }

        return price.compareTo(BigDecimal.valueOf(0.70)) >= 0;
    }
}
