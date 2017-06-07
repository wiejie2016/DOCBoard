package com.demo.dashboard.controller;

import com.demo.dashboard.model.ApplicationHealthMetric;
import com.demo.dashboard.repository.AppHealthMetricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wie.jie.tjoeng on 6/5/2017.
 */

@RestController
@RequestMapping("/api")
public class ApplicationHealthMetricController {

    @Autowired
    private AppHealthMetricRepository applicationHealthMetric;

    public ApplicationHealthMetricController(AppHealthMetricRepository applicationHealthMetric) {
        this.applicationHealthMetric = applicationHealthMetric;
    }

    @GetMapping("/all")
    public List<ApplicationHealthMetric> getAll(){
       List<ApplicationHealthMetric>  metrics = this.applicationHealthMetric.findAll();

       return metrics;
    }
}
