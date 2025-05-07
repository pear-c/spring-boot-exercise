package com.example.runner;

import com.example.cooking.ChefBean;
import com.example.delivery.DeliveryServiceBean;
import com.example.order.OrderProcessorBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class AppStartupRunner implements ApplicationRunner {

    @Autowired
    private OrderProcessorBean orderProcessorBean;
    private ChefBean chefBean;
    private DeliveryServiceBean deliveryServiceBean;

    @Autowired
    public void setChefBean(ChefBean chefBean) {
        this.chefBean = chefBean;
    }
    @Autowired
    public void setDeliveryServiceBean(DeliveryServiceBean deliveryServiceBean) {
        this.deliveryServiceBean = deliveryServiceBean;
    }

    @Override
    public void run(ApplicationArguments args) {
        orderProcessorBean.processOrder();
        chefBean.cook();
        deliveryServiceBean.deliver();
    }
}
