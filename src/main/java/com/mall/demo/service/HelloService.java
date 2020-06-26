package com.mall.demo.service;

import com.mall.demo.model.Vendor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HelloService {
     String hello();
    List<Vendor> getVendors();
}
