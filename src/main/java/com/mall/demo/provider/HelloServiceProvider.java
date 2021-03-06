package com.mall.demo.provider;



import com.mall.demo.mapper.VendorMapper;
import com.mall.demo.model.Vendor;
import com.mall.demo.model.VendorExample;
import com.mall.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloServiceProvider implements HelloService {

    @Autowired
    private VendorMapper vendorMapper;
    @Override
    public String hello() {
        return "NIhao";
    }

    @Override
    public List<Vendor> getVendors() {

        VendorExample vendorExample = new VendorExample();
        vendorExample.createCriteria().andVendorIdIsNotNull();

        return vendorMapper.selectByExample(vendorExample);

    }

    @Override
    public void insertValue(Object testdata) {
        Vendor a = new Vendor();
        a.setVendorName(testdata.toString());
        vendorMapper.insert(a);
    }

}
