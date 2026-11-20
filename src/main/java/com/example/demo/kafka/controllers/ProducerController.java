package com.example.demo.kafka.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/producer")
class ProducerController {

  private KafkaTemplate<String,String> kafkaTemplate;

  public ProducerController(
    KafkaTemplate<String, String> kafkaTemplate
) {
    this.kafkaTemplate = kafkaTemplate;
}

    @GetMapping("/produce/string")  
    public ResponseEntity<String> getMessage(@RequestParam("message") String text){
    System.out.println("message = "+text);
    kafkaTemplate.send("cat", text);
    return ResponseEntity.ok("message sent");

  }
}



/*
  public ProducerController(
    @Qualifier("kafkaTemplate") KafkaTemplate<String, String> kafkaTemplate,
    @Qualifier("kafkaTemplateJSON") KafkaTemplate<String, Cat> kafkaTemplateJSON
) {
    this.kafkaTemplate = kafkaTemplate;
    this.kafkaTemplateJSON = kafkaTemplateJSON;
}
*/