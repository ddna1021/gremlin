package com.tinkerpop.gremlin.java.filter;

import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.impls.tg.TinkerGraphFactory;
import com.tinkerpop.gremlin.java.GremlinPipeline;
import com.tinkerpop.gremlin.test.ComplianceTest;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class IntervalStepTest extends com.tinkerpop.gremlin.test.filter.IntervalStepTest {

    Graph g = TinkerGraphFactory.createTinkerGraph();

    public void testCompliance() {
        ComplianceTest.testCompliance(this.getClass());
    }

    public void test_g_v1_outE_intervalXweight_0_06X_inV() {
        super.test_g_v1_outE_intervalXweight_0_06X_inV(new GremlinPipeline(g.getVertex(1)).outE().interval("weight", 0.0f, 0.6f).inV());
        super.test_g_v1_outE_intervalXweight_0_06X_inV(new GremlinPipeline(g.getVertex(1)).optimize(false).outE().interval("weight", 0.0f, 0.6f).inV());
    }
}
