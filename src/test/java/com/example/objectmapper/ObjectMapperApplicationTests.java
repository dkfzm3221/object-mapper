package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("----------------------------");

        //Text JSON -> Object
        //Object -> Text Json

        //Controller req json(text) -> object
        //response object -> json(text)

        var objectMapper = new ObjectMapper();

        //object -> text
        //object mapper get method 를 활용
        var user = new User("jaeseop", 10, "445454545");

        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        //text -> object

        //object mapper 는 default 생성자를 필요로 한다.
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }




}
