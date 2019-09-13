package ink.irene.demo.contoller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

import ink.irene.demo.model.User;
import ink.irene.demo.mapper.TestMapper;

@RestController
public class Controller {
    private TestMapper mapper;

    public Controller(TestMapper mapper) {
        this.mapper = mapper;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Map<String, String> createUser(@RequestBody User user) {
        Map<String, String> map = new HashMap<>();
        try {
            mapper.insert(user);
            map.put("result", "success");
            map.put("message", "success");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("result", "failed");
            map.put("message", e.toString());
        }
        return map;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Integer id) {
        return mapper.getById(id);
    }
}
