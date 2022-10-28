package fr.lernejo.umlgrapher;

public class UmlGraph {

    private final Class<?>[] entities;

    public UmlGraph(Class<?>[] entities) {
        this.entities = entities;
    }

    public String as(GraphType type) {
        String output = "classDiagram\n";

        for(Class<?> entity : entities){
            if(type == GraphType.Mermaid){
                output += "class " + entity.getSimpleName() + " {\n";
                if(entity.isInterface()){
                    output += "    <<interface>>\n";
                }
            }
            output += "}\n";
        }

        return output;
    }

}
