# Java Project with Kafka

A small **Spring Boot** project that sends messages to **Kafka** and listens to them.
Messages can be either **JSON** or plain **strings**.

---

## Table of Contents

- [API Endpoints](#api-endpoints)
- [Message Types (JSON / String)](#message-types-json--string)
- [Getting Started](#getting-started)

---

## API Endpoints

The project has 4 URLs. Example requests (with data, if needed) are stored in the `testhttp.http` file.

| # | Method | URL | Description |
|---|--------|-----|-------------|
| 1 | `POST` | `http://localhost:8081/json/producer/produce` | Accepts JSON with the fields `id`, `color`, `name`, `age` and sends it to Kafka |
| 2 | `GET` | `http://localhost:8081/producer/produce/string?message=` | Sends the text written after `message=` to Kafka |
| 3 | `GET` | `http://localhost:8081/consumer/jsons` | Shows all JSONs that were listened to during this session |
| 4 | `GET` | `http://localhost:8081/consumer/` | Shows all strings that were listened to during this session |

**Example JSON for endpoint 1:**

```json
{
  "id": 1,
  "color": "black",
  "name": "Barcik",
  "age": 1
}
```

---

## Message Types (JSON / String)

> **Note:** At one time the project listens to only **one type** of messages: JSON or string.
> Currently it works with **JSON**.

To switch the type, change the code in the two places below.

### 1. `src/main/resources/application.properties`

**Uncomment** these 2 lines:

```properties
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
```

**Comment out** these 2 lines:

```properties
# spring.kafka.consumer.value-deserializer=org.springframework.kafka.support.serializer.JsonDeserializer
# spring.kafka.producer.value-serializer=org.springframework.kafka.support.serializer.JsonSerializer
```

### 2. `src/main/java/com/example/demo/kafka/controllers/ConsumerController.java`

**Uncomment** the string listener:

```java
@KafkaListener(topics = "cat", groupId = "myGroup")
public void consume(String message) {
    consumed.add(message);
    System.out.println("consume message " + message);
}
```

**Comment out** the JSON listener:

```java
// @KafkaListener(topics = "cat_json", groupId = "myGroup")
// public void consume1(Cat cat) {
//     consumedCats.add(cat);
//     System.out.println("consume message " + cat.toString());
// }
```

### Quick summary

| Mode | Topic | Listener method | Endpoints to use |
|------|-------|-----------------|------------------|
| JSON (current) | `cat_json` | `consume1(Cat cat)` | 1 and 3 |
| String | `cat` | `consume(String message)` | 2 and 4 |

---

## Getting Started

### 1. Start Kafka

Start Kafka by yourself, or use the one prebuilt in the project (runs in Docker):

```bash
docker compose up -d
```

### 2. Start the project

```bash
.\mvnw.cmd clean spring-boot:run
```

The application will be available at `http://localhost:8081`.
