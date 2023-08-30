package com.quest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quest.entity.Feedback;



@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {

}
