/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont.writers;

import com.github.ffremont.pojo.Person;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("personDaoWriter")
public class PersonDaoWriter implements ItemWriter<Person> {

    private final static String INSERTS = "INSERT INTO PERSONNE (ID, NOM, PRENOM, CIVILITE) VALUES (?, ?, ?, ?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public void write(List<? extends Person> list) throws Exception {
        
        jdbcTemplate.batchUpdate(INSERTS, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Person person = list.get(i);
                ps.setInt(1, person.getId());
                ps.setString(2, person.getNom());
                ps.setString(3, person.getPrenom());
                ps.setString(4, person.getCivilite());
            }

            @Override
            public int getBatchSize() {
                return list.size();
            }

        });

    }

}
