error id: file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/ProducerController.java:_empty_/id#
file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/ProducerController.java
empty definition using pc, found symbol in pc: _empty_/id#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 561
uri: file:///C:/Users/anako/Downloads/demo/src/main/java/com/example/demo/ProducerController.java
text:
```scala
package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/producer")
class ProducerController {
  
    @GetMapping("/{text}")  
  public ResponseEntity<String> getMessage(@PathVariable String text){

    System.out.println("cat");
     return ResponseEntity.ok(i@@d);
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/id#