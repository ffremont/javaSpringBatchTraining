/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ffremont;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author florent
 */
@Component("myPartitioner")
public class MyPartitioner implements Partitioner {

    @Override
    public Map<String, ExecutionContext> partition(int gridSize) {
        Map<String, ExecutionContext> parts = new HashMap<>();

        parts.put("partition0", new ExecutionContext(ImmutableMap.of(
                "filename", "collection_1.csv"
        )));
        parts.put("partition1", new ExecutionContext(ImmutableMap.of(
                "filename", "collection_2.csv"
        )));

        return parts;
    }

}
