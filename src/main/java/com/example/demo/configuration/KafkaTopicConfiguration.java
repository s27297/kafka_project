package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.apache.kafka.clients.admin.NewTopic;

@Configuration 
class KafkaTopicConfiguration {

    @Bean 
    public NewTopic catTopic(){
        return TopicBuilder.name("cat").build();
  }

   @Bean 
    public NewTopic catJSONTopic(){
        return TopicBuilder.name("cat_json").build();
  }
}
