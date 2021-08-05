package com.canturet.springbootbookseller.service;

import com.canturet.springbootbookseller.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
