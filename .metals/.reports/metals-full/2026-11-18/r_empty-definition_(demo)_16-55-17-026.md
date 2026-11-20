error id: file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/kafka/controllers/ProducerController.java:_empty_/message#
file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/kafka/controllers/ProducerController.java
empty definition using pc, found symbol in pc: _empty_/message#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 791
uri: file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/kafka/controllers/ProducerController.java
text:
```scala
package com.example.demo.kafka.controllers;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/producer")
class ProducerController {

  private KafkaTemplate<String,String> kafkaTemplate;

  public ProducerController(KafkaTemplate<String,String> kafkaTemplate){
    this.kafkaTemplate=kafkaTemplate;
  }
  
    @GetMapping("/produce")  
    public void getMessage(@RequestParam("message") String text){
    System.out.println("message = "+messag@@e);
    kafkaTemplate.send("cat", text);

  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/message#