error id: file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/kafka/controllers/ProducerController.java:com/example/demo/kafka/controllers/ProducerController#kafkaTemplateJSON#
file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/kafka/controllers/ProducerController.java
empty definition using pc, found symbol in pc: com/example/demo/kafka/controllers/ProducerController#kafkaTemplateJSON#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1208
uri: file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/kafka/controllers/ProducerController.java
text:
```scala
package com.example.demo.kafka.controllers;

import com.example.demo.dto.Cat;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/producer")
class ProducerController {

  private KafkaTemplate<String,String> kafkaTemplate;

  public ProducerController(
    @Qualifier("kafkaTemplate") KafkaTemplate<String, String> kafkaTemplate,
    @Qualifier("kafkaTemplateJSON") KafkaTemplate<String, Cat> kafkaTemplateJSON
) {
    this.kafkaTemplate = kafkaTemplate;
    this.kafkaT@@emplateJSON = kafkaTemplateJSON;
}

    @GetMapping("/produce/string")  
    public ResponseEntity<String> getMessage(@RequestParam("message") String text){
    System.out.println("message = "+text);
    kafkaTemplate.send("cat", text);
    return ResponseEntity.ok("message sent");

  }


  

    @PostMapping("/produce/json")  
    public ResponseEntity<String> getMessage(@RequestBody Cat cat){
      Message<Cat> message = MessageBuilder
      .withPayload(cat)
      .setHeader(KafkaHeaders.TOPIC, "cat_json")
      .build();
      kafkaTemplateJSON.send(message);
 
      return ResponseEntity.ok("message sent "+cat.toString());

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
```


#### Short summary: 

empty definition using pc, found symbol in pc: com/example/demo/kafka/controllers/ProducerController#kafkaTemplateJSON#