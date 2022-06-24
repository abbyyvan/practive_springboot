package org.petgo.jingyuan.petgo;

import org.springframework.data.jpa.repository.JpaRepository;

//here contains bussiness logics
//then create a test case
public interface UserRepository extends JpaRepository<User,Long>{
    
}
