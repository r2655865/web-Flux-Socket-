package com.webflux_websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;

import java.util.concurrent.ConcurrentHashMap;

/**
 * create by jack 2018/6/2
 * websocket 配置类
 */
@Configuration
public class WebSocketConfiguration {

    @Bean
    public HandlerMapping webSocketMapping() {
        return new WebSocketMappingHandlerMapping();
    }

    @Bean
    public WebSocketHandlerAdapter handlerAdapter() {
        return new WebSocketHandlerAdapter();
    }

    @Bean
    public ConcurrentHashMap<String, WebSocketSender> senderMap() {
        return new ConcurrentHashMap<String, WebSocketSender>();
    }
}
