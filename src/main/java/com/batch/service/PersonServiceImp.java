package com.batch.service;

import com.batch.dao.IPersonDAO;
import com.batch.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImp implements IPersonService{

    @Autowired
    private IPersonDAO iPersonDAO;

    @Transactional
    @Override
    public void saveAll(List<Person> personList) {
        iPersonDAO.saveAll(personList);
    }
}
