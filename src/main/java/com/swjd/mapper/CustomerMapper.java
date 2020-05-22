package com.swjd.mapper;

import com.swjd.bean.Customer;

import java.util.List;

public interface CustomerMapper {
    //全查
    public abstract List<Customer> getAll();
}
