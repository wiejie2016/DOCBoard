package com.demo.dashboard.util;

import com.demo.dashboard.model.Device;
import com.demo.dashboard.repository.DeviceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wie.jie.tjoeng on 6/19/2017.
 */

@Component
public class DbSeederDevice implements CommandLineRunner {

    private DeviceRepository deviceRepository;

    public DbSeederDevice(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Device device1 = new Device();

        // Drop all the data
//        deviceRepository.deleteAll();

        // Add the data into the database
//       List<Device> devices = Arrays.asList(device1);

    }



}
