package com.demo.dashboard.repository;

import com.demo.dashboard.model.ApplicationHealthMetric;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by wie.jie.tjoeng on 6/5/2017.
 */

@Repository
public interface AppHealthMetricRepository extends MongoRepository<ApplicationHealthMetric, String>, QueryDslPredicateExecutor<ApplicationHealthMetric> {

     ApplicationHealthMetric findById(String id);

}

