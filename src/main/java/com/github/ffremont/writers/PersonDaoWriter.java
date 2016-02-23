/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont.writers;

import com.github.ffremont.pojo.Person;
import java.util.List;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("personDaoWriter")
public class PersonDaoWriter implements ItemWriter<Person> {

    
    @Override
    public void write(List<? extends Person> list) throws Exception {
        

    }

}
