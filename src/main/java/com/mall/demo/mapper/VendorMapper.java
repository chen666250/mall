package com.mall.demo.mapper;

import com.mall.demo.model.Vendor;
import com.mall.demo.model.VendorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VendorMapper {
    int countByExample(VendorExample example);

    int deleteByExample(VendorExample example);

    int deleteByPrimaryKey(Integer vendorId);

    int insert(Vendor record);

    int insertSelective(Vendor record);

    List<Vendor> selectByExample(VendorExample example);

    Vendor selectByPrimaryKey(Integer vendorId);

    int updateByExampleSelective(@Param("record") Vendor record, @Param("example") VendorExample example);

    int updateByExample(@Param("record") Vendor record, @Param("example") VendorExample example);

    int updateByPrimaryKeySelective(Vendor record);

    int updateByPrimaryKey(Vendor record);
}