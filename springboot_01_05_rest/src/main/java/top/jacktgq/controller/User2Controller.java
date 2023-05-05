package top.jacktgq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author CandyWall
 * @Date 2022/1/19--12:57
 * @Description
 */
@RestController
@RequestMapping("/users2")
public class User2Controller {
    @PostMapping
    public String save(@RequestBody User user) {
        System.out.println("user2 save..." + user);
        return "{'module':'user2 save'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("user2 delete..." + id);
        return "{'module':'user2 delete'}";
    }

    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("user2 update..." + user);
        return "{'module':'user2 update'}";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("user2 getById..." + id);
        return "{'module':'user2 getById'}";
    }

    @GetMapping
    public String getAll() {
        System.out.println("user2 getAll...");
        return "{'module':'user2 getAll'}";
    }
}
