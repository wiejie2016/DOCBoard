package com.demo.dashboard.controller;

import com.demo.dashboard.model.Device;
import com.demo.dashboard.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wie.jie.tjoeng on 6/19/2017.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/device")
public class DeviceController {

    @Autowired
    private DeviceRepository device;

    public DeviceController(DeviceRepository device) {
        this.device = device;
    }

    @GetMapping("/all")
    public List<Device> getAll(){

        List<Device> devices = this.device.findAll();

        return devices;
    }
}
