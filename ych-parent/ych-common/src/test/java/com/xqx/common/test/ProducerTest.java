//package com.xqx.common.test;
//
//import com.xqx.ych.common.rocketmq.TradeMQProducer;
//import org.apache.rocketmq.client.producer.SendResult;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:xml/spring-rocketmq-producer.xml")
//public class ProducerTest {
//    @Resource
//    private TradeMQProducer tradeMQProducer;
//    @Test
//    public void testProducer(){
//        SendResult sendResult=tradeMQProducer.sendMessage("enrollTopic","cancel","testKey","TestBody");
//        System.out.println("sendResult"+sendResult);
//
//    }
////    @Test
////    public void testConsumer() throws InterruptedException {
////        Thread.sleep(10000);
////    }
//}
