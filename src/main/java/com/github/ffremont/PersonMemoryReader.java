/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont;

import com.github.ffremont.pojo.Person;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("personMemoryReader")
@Scope(value = "step")
public class PersonMemoryReader implements ItemReader<Person> {

    private final static Logger LOG = LoggerFactory.getLogger(PersonMemoryReader.class);
    

    /**
     * Index courant dans la collection 
     */
    private int readIndex;
    
    public PersonMemoryReader() {
        this.readIndex = 0;
    }

    @Override
    public Person read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return null;
    }

}
