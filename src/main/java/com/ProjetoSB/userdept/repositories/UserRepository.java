package com.ProjetoSB.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoSB.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
