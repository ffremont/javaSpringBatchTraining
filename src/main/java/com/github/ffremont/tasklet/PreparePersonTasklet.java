/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont.tasklet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("preparePersonTasklet")
public class PreparePersonTasklet implements Tasklet {

    private final static Logger LOG = LoggerFactory.getLogger(PreparePersonTasklet.class);

    private final static String DELETE_RECORDS = "DELETE FROM PERSONNE";
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        // why not using println? because it makes testing harder, *nix and
        // windows think different about new line as in \n vs \r\n
        LOG.info("Remove {} records in {} table", jdbcTemplate.update(DELETE_RECORDS), "PERSONNE");

        // we want the step to stop here, the other status 
        // RepeatStatus.CONTINUABLE would start an endless loop here
        return RepeatStatus.FINISHED;
    }

}
