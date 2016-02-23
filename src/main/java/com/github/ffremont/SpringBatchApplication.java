/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont;

import java.util.Date;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author florent
 */
public class SpringBatchApplication {

    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(SpringBatchApplication.class);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpt = new ClassPathXmlApplicationContext("simple-job.xml");
        cpt.start();
        JobLauncher jobLauncher = (JobLauncher) cpt.getBean("jobLauncher");
        Job job = (Job) cpt.getBean("simpleStepJob");
        
        JobParameters parameter = new JobParametersBuilder().addDate("date", new Date()).toJobParameters();
        
        try {
            jobLauncher.run(job, parameter);
        } catch (JobExecutionException ex) {
            LOG.error("Oups", ex);
        } 
    }
    
}
