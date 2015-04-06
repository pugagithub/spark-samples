package com.dsinpractice.spark;

import com.dsinpractice.spark.samples.*;
import org.apache.hadoop.util.ProgramDriver;

public class SparkSampleDriver {

    public static void main(String[] args) throws Throwable {
        ProgramDriver programDriver = new ProgramDriver();
        programDriver.addClass("whole-text-files", WholeTextFiles.class,
                "Demonstrates Spark's ability to process the entire contents of a text file in a single map invocation");
        programDriver.addClass("parallelize-collections", ParallelizeCollections.class,
                "Demonstrates how we can parallelize a collection into an RDD with 'n' partitions.");
        programDriver.addClass("map-partitions", MapPartitions.class,
                "Demonstrates mapPartitions API where map gets entire partition data at once.");
        programDriver.addClass("set-operations", SetOperations.class,
                "Demonstrates APIs related to set opertions like union, etc.");
        programDriver.addClass("sampler", Sampler.class,
                "Demonstrates API related to sampling data.");
        programDriver.addClass("persistence", Persistence.class,
                "Demonstrates API related to persisting RDDs in memory / disk etc.");
        programDriver.addClass("joiner", Joiner.class,
                "Demonstrates APIs related to joining / co-grouping RDDs.");
        programDriver.addClass("piped-command", PipedCommand.class,
                "Demonstrates API that passes each record in input to an external script via the pipe API.");
        programDriver.addClass("broadcast-vars", BroadcastVars.class,
                "Demonstrates API that can be used to broadcast a variable to Spark tasks.");
        programDriver.addClass("accumulators", Accumulators.class,
                "Demonstrates API that can be used to count some metrics across tasks using " +
                        "special variables called accumulators.");
        programDriver.driver(args);
    }
}