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
public class Materia {

    public Materia() {
    }
    
    public String carreraAlaQuePerteneceLaMateria(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
         "SELECT?Nrc ?Carrera?Materia "+
        "WHERE "+
        "{ "+
        " ?n hc:PerteneceAUna ?c."+
        " ?n hc:nrc ?Nrc."+
        " ?n hc:descripcion ?Materia."+
        " ?c hc:nombre ?Carrera"+
        "}";
    }
    
    public String parametroListaEstudiantesxMateria(String materia){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?Estudiante ?Materia "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?m."+
        " ?m hc:RegistraUn?ma."+
        " ?e hc:nombre ?Estudiante."+
        " ?ma hc:descripcion ?Materia."+
        " FILTER regex(?Materia,'"+ materia + "')"+
        "}";
    }
    
    public String parametroCarreraAlaQuePerteneceLaMateria(String carrera){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?Nrc ?Carrera "+
        "WHERE "+
        "{ "+
        " ?n hc:PerteneceAUna ?c."+
        " ?n hc:nrc ?Nrc."+
        " ?c hc:nombre ?Carrera."+
        " FILTER regex(?Carrera,'"+ carrera + "')"+
        "}";
    }
}
