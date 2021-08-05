package com.canturet.springbootbookseller.service;

import com.canturet.springbootbookseller.model.User;

public interface IAuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
