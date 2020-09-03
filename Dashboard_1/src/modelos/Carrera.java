/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author USER
 */
public class Carrera {

    public Carrera() {
    }
    
    public String materiasDeLaCarrera(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?Carrera?Nrc "+
        "WHERE "+
        "{ "+
        " ?c hc:Habilita?n."+
        " ?n hc:nrc ?Nrc."+
        " ?c hc:nombre ?Carrera"+
        "}";
    }
    
    public String docentesDeLaCarrera(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?Docente ?Carrera "+
        "WHERE "+
        "{ "+
        " ?d hc:EsAsignadoA?m."+
        " ?m hc:PerteneceAUna?c."+
        " ?d hc:nombre ?Docente."+
        " ?c hc:nombre ?Carrera"+
        "}";
    }
    
    public String parametroMateriasDeLaCarrera(String carrera){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?Carrera?Nrc "+
        "WHERE "+
        "{ "+
        " ?c hc:Habilita?n."+
        " ?n hc:nrc ?Nrc."+
        " ?c hc:nombre ?Carrera."+
        " FILTER regex(?Carrera,'"+ carrera + "')"+
        "}";
    }
}
