package com.example.mongoassign.Repository;

import com.example.mongoassign.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MembersRepository extends MongoRepository<Member,String> {

}
