package com.giit.www.college.service;

import com.giit.www.entity.Spec;
import com.giit.www.entity.custom.DeptAndSpec;

import java.util.List;


public interface SpecBiz {

    public void update(String specName, String newSpecName);

    public void add(Spec spec);

    public void delete(String specName);

    public List<DeptAndSpec> findDeptAndSpec();

    public List<String> findDpet();
}
