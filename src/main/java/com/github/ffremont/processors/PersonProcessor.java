/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont.processors;

import com.github.ffremont.pojo.Person;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("personProcessor")
public class PersonProcessor implements ItemProcessor<Person, Person>{

    @Override
    public Person process(Person i) throws Exception {
       
        return i;
    }
    
}
