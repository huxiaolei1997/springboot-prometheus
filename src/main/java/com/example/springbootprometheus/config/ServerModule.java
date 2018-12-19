//package com.example.springbootprometheus.config;
//
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.network.InetAddresses;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.net.InetSocketAddress;
//
///**
// * 用途描述
// *
// * @author 胡晓磊
// * @version $Id: ServerModule, v0.1
// * @company 杭州信牛网络科技有限公司
// * @date 2018年12月13日 14:27 胡晓磊 Exp $
// */
//@Configuration
//public class ServerModule {
//    @Bean
//    public TransportClient transportClient() {
//        Settings settings = Settings.builder().put("cluster.name", "test").build();
//
//        TransportClient client = new PreBuiltTransportClient(settings);
//
//        client.addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress(InetAddresses.forString("127.0.0.1"), 9300)));
//
//        return client;
//
//    }
//
//}
