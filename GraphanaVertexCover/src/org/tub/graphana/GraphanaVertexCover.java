/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tub.graphana;

import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsBuilder;
import org.openide.util.lookup.ServiceProvider;
import org.tub.akt.graphanaexecuter.GraphanaStatistics;
import org.tub.akt.graphanaexecuter.GraphanaStatisticsBuilder;

@ServiceProvider (service=StatisticsBuilder.class)
public class GraphanaVertexCover extends GraphanaStatisticsBuilder {
    

    public GraphanaVertexCover() {
        statistics = new VertexCoverStatistics();
    }
    
    @Override
    public String getName() {
        return "Vertex Cover";
    }

    @Override
    public Class<? extends Statistics> getStatisticsClass() {
        //return VertexCoverStatistics.class;
        return VertexCoverStatistics.class;
    }
    
}
