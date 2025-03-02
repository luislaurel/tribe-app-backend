package com.savvato.tribeapp.repositories;

import com.savvato.tribeapp.entities.ReviewDecisionReason;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewDecisionReasonRepository extends CrudRepository<ReviewDecisionReason, Long> {
}
