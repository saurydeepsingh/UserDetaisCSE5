package com.User.details.User.Details.Service;

import com.User.details.User.Details.Model.UserModel;
import com.User.details.User.Details.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo Repo;

    public List<UserModel> getListofUser() {
        return Repo.findAll();

    }

    public UserModel addUserModel(UserModel um) {
        return Repo.save(um);

    }

    public UserModel MyID(String myid) {
        return Repo.findById(myid).orElse(null);
    }

    public UserModel deletethedata(String id) {
        UserModel user = Repo.findById(id).orElse(null);
        if(user != null){
            Repo.deleteById(id);
        }
        return user;
    }
}

