package com.User.details.User.Details.Controller;

import com.User.details.User.Details.Model.UserModel;
import com.User.details.User.Details.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService Service;

    @GetMapping("/UserList")
    List<UserModel> ListofUSer(){
        return Service.getListofUser();
    }

    @GetMapping("/hello")
    public String hel(){
        return "Hello wolrd";
    }

    @PostMapping("/UserList")
    public UserModel Post(@RequestBody UserModel um){
        return Service.addUserModel(um);
    }
    @GetMapping("/UserListID/{Myid}")
    public UserModel MyID(@PathVariable String Myid){
        return Service.MyID(Myid);
    }

    @DeleteMapping("/UserDelete/{id}")
    public UserModel deletedata(@PathVariable String id){
        return Service.deletethedata(id);
    }


}
