package com.demo.dashboard.repository;

import com.demo.dashboard.model.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by wie.jie.tjoeng on 6/19/2017.
 */
public interface DeviceRepository  extends MongoRepository<Device, String>{

    Device findById(String id);
}
