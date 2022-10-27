package fr.lernejo.umlgrapher;

public class UmlGraph {

    private final Class<?>[] entities;

    public UmlGraph(Class<?>[] entities) {
        this.entities = entities;
    }

    public String as(GraphType type) {
        String output = "";

        if(type.name().equals("Mermaid")){
            output = """
            classDiagram
            class Machin {
                <<interface>>
            }
            """;
        }
        return output;
    }

}
