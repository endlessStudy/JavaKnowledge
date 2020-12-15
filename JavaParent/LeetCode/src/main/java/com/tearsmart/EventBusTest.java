package com.tearsmart;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * @author 刘彦磊
 * @date 2020/12/14
 */
public class EventBusTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus("111");
        eventBus.register(new RegisteredEventEmailSubscriber());
        eventBus.register(new RegisteredEventSmsSubscriber());

        // 注册逻辑...
        // 注册后
        RegisteredEvent event = new RegisteredEvent();
        event.name = "张小胖";
        event.mobile = "18800000001";
        event.email = "zhangxiaopang@gmail.com";

        eventBus.post(event);
    }
}

class RegisteredEventSmsSubscriber {
    @Subscribe
    public void handle(RegisteredEvent event) {
        System.out.println("sms to " + event.mobile + ": Welcome " + event.name);
    }
}

class RegisteredEventEmailSubscriber {
    @Subscribe
    public void handle(RegisteredEvent event) {
        System.out.println("email to " + event.email + ": Welcome " + event.name);
    }
}

class RegisteredEvent {
    public String name;
    public String mobile;
    public String email;
}
