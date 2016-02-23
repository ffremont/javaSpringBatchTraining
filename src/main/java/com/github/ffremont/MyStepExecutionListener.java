/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("myStepExecutionListener")
public class MyStepExecutionListener implements StepExecutionListener{

    private final static Logger LOG = LoggerFactory.getLogger(MyStepExecutionListener.class);
    
    
    @Override
    public void beforeStep(StepExecution stepExecution) {
        LOG.info("Before Step, number of steps {}", stepExecution.getJobExecution().getStepExecutions().size());
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        LOG.info("After Step, number of steps {}", stepExecution.getJobExecution().getStepExecutions().size());
        
        return stepExecution.getExitStatus();
    }
    
}
