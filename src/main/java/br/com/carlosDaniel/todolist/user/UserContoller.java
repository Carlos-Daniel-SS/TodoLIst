package br.com.carlosDaniel.todolist.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/*
 * Modificadores:
 * public
 * private
 * protected
 */


@RestController
@RequestMapping("/users")
public class UserContoller {

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getName());
    }
}
