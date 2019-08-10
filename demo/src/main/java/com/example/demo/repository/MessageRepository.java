/**
 * 
 */
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entitiy.Message;

/**
 * @author user
 *
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{
	@Query("from Message m where trim(upper(m.message)) like trim(upper(%?1%))")
	List<Message> findMessages(String message);
}
