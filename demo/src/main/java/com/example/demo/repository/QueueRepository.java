/**
 * 
 */
package com.example.demo.repository;

import javax.management.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitiy.Queue;

/**
 * @author user
 *
 */
@Repository
public interface QueueRepository extends JpaRepository<Queue, Long>{

}
