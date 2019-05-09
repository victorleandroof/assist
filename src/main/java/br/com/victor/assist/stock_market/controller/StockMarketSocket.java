package br.com.victor.assist.stock_market.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class StockMarketSocket {


    @MessageMapping("/stock_market")
    @SendTo("/topic/sotck_market")
    public String greeting(String mensage) throws Exception {
        Thread.sleep(1000); // simulated delay
        return mensage;
    }

}
