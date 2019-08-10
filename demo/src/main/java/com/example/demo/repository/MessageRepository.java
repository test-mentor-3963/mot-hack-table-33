/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitiy.Message;

/**
 * @author user
 *
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{

}
