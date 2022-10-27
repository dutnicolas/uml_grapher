package fr.lernejo.umlgrapher;

import picocli.CommandLine;
import picocli.CommandLine.Option;

public class Launcher implements Runnable{

    @Option(names = { "-c", "--classes"}, required = true, description = "Enter class(es) name(s)")
    private final Class[] entities = null;

    @Option(names = { "-g", "--graph-type" }, description = "Enter type of graph")
    private final GraphType graphType = GraphType.Mermaid;

    public static void main(String... args) {
        int exitCode = new CommandLine(new Launcher()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        UmlGraph graph  = new UmlGraph(entities);
        System.out.println(graph.as(graphType));
    }
}
