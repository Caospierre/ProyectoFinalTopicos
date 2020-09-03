/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package ontologia;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;
/**
 *
 * @author USER
 */
public class Coneccion {
    private OntModel modelo;

    public Coneccion() {
        this.modelo = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
        InputStream in = FileManager.get().open("C:\\entregable3.owl");
        if (in==null)
        {
         throw new IllegalArgumentException("Archivo no encontrado");
        }
        this.modelo.read(in, "");
    }

    
    public Vector mapeoResultados(String queryString){
       
        Vector vec =new Vector();
        List<String> key =  new ArrayList<String>();
        List<String> values =  new ArrayList<String>();
        Query query=QueryFactory.create(queryString);
        System.out.println("****CONSULTANDO*******");
        QueryExecution qu=QueryExecutionFactory.create(query,this.modelo);
        try
        {
        ResultSet results;
        results=(ResultSet)qu.execSelect();
        
        List<String> varNames = results.getResultVars();
        
        int i = 0;
         while(results.hasNext()) {
            QuerySolution sol = (QuerySolution) results.next();
            
            for (String var: varNames) {
               //System.out.println("value of " + var + ": " + sol.get(var));
               if(!key.contains(var)){
                  
                    key.add(var);
                }   
               
               values.add(sol.get(var).toString());
               
            }
         }
        } finally{qu.close();}
        vec.add(key);
        System.out.println("************************");
        System.out.println("cantidad de variables "+key.size());
        System.out.println("cantidad de de datos "+values.size());
        vec.add(values);
        
        return vec;
    }
}
