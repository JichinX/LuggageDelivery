package com.graduate.luggagedelivery.rest_server.service;

import com.graduate.luggagedelivery.rest_server.base.Status;
import com.graduate.luggagedelivery.rest_server.base.WrapperList;
import com.graduate.luggagedelivery.rest_server.dao.TDeptMapper;
import com.graduate.luggagedelivery.rest_server.entity.TDept;
import com.graduate.luggagedelivery.rest_server.entity.TDeptExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IDeptServiceImpl implements IDeptService {
    @Resource
    private TDeptMapper mapper;

    @Override
    public WrapperList<TDept> getDepts() {
        WrapperList<TDept> wrapperList = new WrapperList<>();
        List<TDept> depts = mapper.selectByExample(new TDeptExample());
        if (null != depts) {
            wrapperList.setData(depts);
            wrapperList.setStatus(Status.SUCCESS);
        } else {
            wrapperList.setStatus(Status.QUERY_FAILED);
        }
        return wrapperList;
    }

    @Override
    public WrapperList<TDept> addDept(TDept dept) {
        WrapperList<TDept> wrapperList = new WrapperList<>();
        int result = mapper.insert(dept);
        if (result > 0) {
            return getDepts();
        } else {
            wrapperList.setStatus(Status.INSERT_FAILED);
        }
        return wrapperList;
    }
}
