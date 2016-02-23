/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont;

import com.github.ffremont.pojo.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("partitionPersonReader")
@Scope(value = "step")
public class PartitionPersonReader implements ItemReader<Person>{

    private final static Logger LOG = LoggerFactory.getLogger(PartitionPersonReader.class);
    
    @Value("#{stepExecutionContext[filename]}")
    String filename;
    
    @Override
    public Person read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        LOG.info("Lecture du fichier {}", filename);
        
        return null;
    }
    
}
