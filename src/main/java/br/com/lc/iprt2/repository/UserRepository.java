package br.com.lc.iprt2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import br.com.lc.iprt2.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

     UserDetails findByEmail(String email);
}
