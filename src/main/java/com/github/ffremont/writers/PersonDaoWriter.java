/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont.writers;

import com.github.ffremont.pojo.Person;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("personDaoWriter")
public class PersonDaoWriter implements ItemWriter<Person> {

    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(PersonDaoWriter.class);
    
    @Override
    public void write(List<? extends Person> list) throws Exception {
        
        LOG.info("Write {}", list.size());

    }

}
