/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adverweb.validator.mogomodel;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Damian
 */
public interface UserRepository extends MongoRepository<User, String>{
    
    
}
