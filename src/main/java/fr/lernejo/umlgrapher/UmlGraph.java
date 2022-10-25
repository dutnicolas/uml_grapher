package fr.lernejo.umlgrapher;

public class UmlGraph {

    private final Class<?> entity;

    public UmlGraph(Class<?> entity) {
        this.entity = entity;
    }

    public String as(GraphType type) {

        String output = "type";

        if(type.name().equals("Mermaid")){

            output = """
            classDiagram
            class Machin {
                <<interface>>
            }
            """;

            //  PAS FINI
            /*output =
                "classDiagram\n" +
                "class " + entity.getSimpleName() + " {\n" +
                "\t" + entity.getTypeName() + "\n" +
                "}";
             */
        }

        return output;
    }

}
