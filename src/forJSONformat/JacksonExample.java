package forJSONformat;

import JsonGenerationException;
import map.JsonMappingException;
import map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
    // Quick Reference
    ObjectMapper mapper = new ObjectMapper();
            User user = new User();

    //Object to JSON in file
            mapper.writeValue(new File("c:\\user.json"), user);

    //Object to JSON in String
            String jsonInString = mapper.writeValueAsString(user);
*/


public class JacksonExample {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        //For testing
        User user = createDummyUser();

        try {
            //Convert object to JSON string and save into file directly
            mapper.writeValue(new File("D:\\user.json"), user);

            //Convert object to JSON string
            String jsonInString = mapper.writeValueAsString(user);
            System.out.println(jsonInString);

            //Convert object to JSON string and pretty print
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.out.println(jsonInString);


        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static User createDummyUser() {

        User user = new User();

        user.setName("mkyong");
        user.setAge(33);

        List<String> msg = new ArrayList<>();
        msg.add("hello jackson 1");
        msg.add("hello jackson 2");
        msg.add("hello jackson 3");

        user.setMessages(msg);

        return user;

    }
}
