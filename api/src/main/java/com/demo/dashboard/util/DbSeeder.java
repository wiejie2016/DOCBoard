package com.demo.dashboard.util;

import com.demo.dashboard.model.ApplicationHealthMetric;
import com.demo.dashboard.repository.AppHealthMetricRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wie.jie.tjoeng on 6/5/2017.
 */

@Component
public class DbSeeder implements CommandLineRunner{

    private AppHealthMetricRepository appHealthMetricRepository;

    public DbSeeder(AppHealthMetricRepository appHealthMetricRepository) {
        this.appHealthMetricRepository = appHealthMetricRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        ApplicationHealthMetric healthMetric1 = new ApplicationHealthMetric(
                true,
                "ip-10-203-218-6",
                107977,
                "TOMCAT-APP",
                "Other",
                3174,
                342769,
                "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                true,
                "Linux",
                "ip-10-203-218-6_tomcat_02",
                "APP_AGENT",
                "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                "",
                null
        );

        ApplicationHealthMetric healthMetric2 = new ApplicationHealthMetric(
                true,
                "ip-10-203-218-6",
                107978,
                "TOMCAT-APP",
                "Other",
                3174,
                342776,
                "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                true,
                "Linux",
                "ip-10-203-218-6_tomcat_01",
                "APP_AGENT",
                "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                "",
                null
        );

        ApplicationHealthMetric healthMetric3 = new ApplicationHealthMetric(
                 true,
                 "ip-10-203-217-249",
                 110100,
                 "TOMCAT-APP",
                 "Other",
                 3174,
                 345585,
                 "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                 true,
                 "Linux",
                 "ip-10-203-217-249_tomcat_01",
                 "APP_AGENT",
                 "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                 "",
                 null
        );

        ApplicationHealthMetric healthMetric4 = new ApplicationHealthMetric(
                 true,
                 "ip-10-203-217-249",
                 110100,
                 "TOMCAT-APP",
                 "Other",
                 3174,
                 345585,
                 "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                 true,
                 "Linux",
                 "ip-10-203-217-249_tomcat_01",
                 "APP_AGENT",
                 "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                 "",
                 null
        );

        ApplicationHealthMetric healthMetric5 = new ApplicationHealthMetric(
                 true,
                 "ip-10-203-217-249",
                 110100,
                 "TOMCAT-APP",
                 "Other",
                 3174,
                 345585,
                 "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                 true,
                 "Linux",
                 "ip-10-203-217-249_tomcat_01",
                 "APP_AGENT",
                 "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                 "",
                 null
        );


        ApplicationHealthMetric healthMetric6 = new ApplicationHealthMetric(
                 true,
                 "ip-10-203-218-53",
                 113104,
                 "TOMCAT-APP",
                 "Other",
                 3174,
                 349986,
                 "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                 true,
                 "Linux",
                 "ip-10-203-218-53_tomcat_01",
                 "APP_AGENT",
                 "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                 "",
                 null
        );


        ApplicationHealthMetric healthMetric7 = new ApplicationHealthMetric(
                 true,
                 "ip-10-203-217-239",
                 113255,
                 "TOMCAT-APP",
                 "Other",
                 3174,
                 350325,
                 "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                 true,
                 "Linux",
                 "ip-10-203-217-239_tomcat_02",
                 "APP_AGENT",
                 "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                 "",
                 null
        );

        ApplicationHealthMetric healthMetric8 = new ApplicationHealthMetric(
                 true,
                 "ip-10-203-217-239",
                 113255,
                 "TOMCAT-APP",
                 "Other",
                 3174,
                 350333,
                 "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                 true,
                 "Linux",
                 "ip-10-203-217-239_tomcat_01",
                 "APP_AGENT",
                 "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                 "",
                 null
        );

        ApplicationHealthMetric healthMetric9 = new ApplicationHealthMetric(
                 true,
                 "ip-10-203-218-19",
                 114009,
                 "TOMCAT-APP",
                 "Other",
                 3174,
                 352710,
                 "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                 true,
                 "Linux",
                 "ip-10-203-218-19_tomcat_02",
                 "APP_AGENT",
                 "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                 "",
                 null
        );

        ApplicationHealthMetric healthMetric10 = new ApplicationHealthMetric(
                 true,
                 "ip-10-203-218-19",
                 114019,
                 "TOMCAT-APP",
                 "Other",
                 3174,
                 352716,
                 "Machine Agent v4.2.2.0 GA Build Date 2016-05-02 11:40:53",
                 true,
                 "Linux",
                 "ip-10-203-218-19_tomcat_01",
                 "APP_AGENT",
                 "Server Agent v4.2.2.0 GA #11396 ra21a0bd83c595e1c05aeb33347a2949e5a2a78e2 55-4.2.1.viper-build",
                 "",
                 null
        );


        // Drop all the data
        appHealthMetricRepository.deleteAll();

        // Add the data into the database
        List<ApplicationHealthMetric> metricList = Arrays.asList(healthMetric1, healthMetric2, healthMetric3, healthMetric4, healthMetric5, healthMetric6, healthMetric7, healthMetric8, healthMetric9, healthMetric10);
        this.appHealthMetricRepository.save(metricList);
    }
}
