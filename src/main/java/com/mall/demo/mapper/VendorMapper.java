package com.mall.demo.mapper;

import com.mall.demo.model.Vendor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VendorMapper {
    @Select("select * from vendor")
    List<Vendor> getAllvendor();

}
