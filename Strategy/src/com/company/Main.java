package com.company;

public class Main {

    public static void main(String[] args) {
        Context context;

        context = new Context(new ExchangeInBank());
        context.executedExchange(context);
        System.out.println();
        context = new Context(new ExchangeInChangePoint());
        context.executedExchange(context);
        System.out.println();
        context = new Context(new ExchangeInMoneyChanger());
        context.executedExchange(context);
    }
}
