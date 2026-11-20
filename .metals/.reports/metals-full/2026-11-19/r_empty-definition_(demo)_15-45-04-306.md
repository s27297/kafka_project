error id: file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/kafka/controllers/ConsumerController.java:_empty_/message#
file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/kafka/controllers/ConsumerController.java
empty definition using pc, found symbol in pc: _empty_/message#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1193
uri: file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/kafka/controllers/ConsumerController.java
text:
```scala
package com.example.demo.kafka.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Cat;

@RestController
@RequestMapping("/consumer")
class ConsumerController {
    private List<String> consumed=new ArrayList<String>();
    private List<Cat> consumedCats=new ArrayList<Cat>();
  

  @GetMapping("/")  
  public ResponseEntity<List<String>> getMessage(){

     return ResponseEntity.ok(consumed);
  }

  @KafkaListener(topics = "cat", groupId = "myGroup")
  public void consume(String message){
    consumed.add(message);
    System.out.println("consume message " + message);

  }
   @KafkaListener(topics = "cat_json", groupId = "myGroup")
  public void consume1(Cat cat){
    consumedCats.add(@@message.toUpperCase());
    System.out.println("consume message " + cat.toString());

  }

  
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/message#