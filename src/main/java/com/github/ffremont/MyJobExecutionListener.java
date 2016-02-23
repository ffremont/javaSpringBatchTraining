/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont;

import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("myJobExecutionListener")
public class MyJobExecutionListener implements JobExecutionListener{
    
    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(MyJobExecutionListener.class);
    
    
    @Override
    public void beforeJob(JobExecution jobExecution) {
        LOG.info("Before Job {}", jobExecution.getJobInstance().getJobName());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        LOG.info("After Job {}", jobExecution.getJobInstance().getJobName());
    }
    
}
