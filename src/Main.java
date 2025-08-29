import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map < String, Curso> cursos = new HashMap<>();

        Curso c1= new Curso("prog3","matias");
        Curso c2= new Curso("matematicas","sebastian");
        Curso c3= new Curso("base de datos","jorge");
        Curso c4= new Curso("prog3","marquitos");

        cursos.put("MATERIA1",c1);
        cursos.put("MATERIA2",c2);
        cursos.put("MATERIA3",c3);
        //NO SE AGREGA
        cursos.put("MATERIA1",c4);
        //SI SE AGREGA
        cursos.put("MATERIA4",c4);



        System.out.println("Iterando con entrySet():");
        for (Map.Entry<String,Curso> entry : cursos.entrySet()) {
            String curso = entry.getKey();
            Curso profe = entry.getValue();
            System.out.println(curso + " tiene " + profe);
        }

        //NOTA
        //EN MAP SE REMPLASAN LOS VALORES SI TIENE LA MISMA KEY

    }
}