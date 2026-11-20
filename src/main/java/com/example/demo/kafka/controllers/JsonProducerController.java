package com.example.demo.kafka.controllers;

import com.example.demo.dto.Cat;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/json/producer")
class JsonProducerController {

  private KafkaTemplate<String,Cat> kafkaTemplateJSON;

  public JsonProducerController(
    KafkaTemplate<String, Cat> kafkaTemplateJSON
) {
    this.kafkaTemplateJSON = kafkaTemplateJSON;
}

    @PostMapping("/produce")  
    public ResponseEntity<String> getMessage(@RequestBody Cat cat){
      Message<Cat> message = MessageBuilder
      .withPayload(cat)
      .setHeader(KafkaHeaders.TOPIC, "cat_json")
      .build();
      kafkaTemplateJSON.send(message);
 
      return ResponseEntity.ok("message sent "+cat.toString());

  }
}
