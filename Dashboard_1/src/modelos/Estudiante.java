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
public class Estudiante {

    public Estudiante() {
    }
    
    
    public String estaMatriculadoEn(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?nrc "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?ma."+
        " ?ma hc:RegistraUn?m."+
        " ?e hc:nombre ?estudiante."+
        " ?m hc:nrc ?nrc"+
        "}";
    }
    
    public String impedimentosDelEstudiante(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?impedimento "+
        "WHERE "+
        "{ "+
        " ?e hc:PuedeTener?i."+
        " ?e hc:nombre ?estudiante."+
        " ?i hc:descripcion?impedimento"+
        "}";
    }
    
    public String fechaDeMatriculacionDelEstudiante(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?fecha "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?m."+
        " ?e hc:nombre ?estudiante."+
        " ?m hc:fecha ?fecha"+
        "}";
    }
    
    public String getTipoDeEstudiante(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?fecha "+
        "WHERE "+
        "{ "+
        " ?e hc:nombre ?estudiante."+
        " ?e hc:tipo ?tipo"+
        "}";
    }
    
    public String tipoDeMatriculaDelEstudiante(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante ?tipo "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?m."+
        " ?e hc:nombre ?estudiante."+
        " ?m hc:tipo ?tipo"+
        "}";
    }
    
    public String periodoEnElQueSeMatriculaElEstudiante(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?Periodo "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?m."+
        " ?m hc:PerteneceA ?p."+
        " ?e hc:nombre ?estudiante."+
        " ?p hc:nombre ?Periodo"+
        "}";
    }
    
    public String parametroFechaDeMatriculacionDelEstudiante(String estudiante){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?fecha "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?m."+
        " ?e hc:nombre ?estudiante."+
        " ?m hc:fecha ?fecha."+
        " FILTER regex(?estudiante,'"+ estudiante + "')"+
        "}";
    }
    
    public String parametroEstaMatriculadoEn(String estudiante){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?nrc "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?ma."+
        " ?ma hc:RegistraUn?m."+
        " ?e hc:nombre ?estudiante."+
        " ?m hc:nrc ?nrc."+
        " FILTER regex(?estudiante,'"+ estudiante + "')"+
        "}";
    }
    
    public String parametroImpedimentosDelEstudiante(String estudiante){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?impedimento "+
        "WHERE "+
        "{ "+
        " ?e hc:PuedeTener?i."+
        " ?e hc:nombre ?estudiante."+
        " ?i hc:descripcion?impedimento."+
        " FILTER regex(?estudiante,'"+ estudiante + "')"+
        "}";
    }
    
    public String parametroGetTipoDeEstudiante(String estudiante){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?tipo "+
        "WHERE "+
        "{ "+
        " ?e hc:nombre ?estudiante."+
        " ?e hc:tipo ?tipo."+
        " FILTER regex(?estudiante,'"+ estudiante + "')"+
        "}";
    }
    
    public String parametroTipoDeMatriculaDelEstudiante(String estudiante){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante ?tipo "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?m."+
        " ?e hc:nombre ?estudiante."+
        " ?m hc:tipo ?tipo."+
        " FILTER regex(?estudiante,'"+ estudiante + "')"+
        "}";
    }
    
    public String parametroPeriodoEnElQueSeMatriculaElEstudiante(String estudiante){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?estudiante?Periodo "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?m."+
        " ?m hc:PerteneceA ?p."+
        " ?e hc:nombre ?estudiante."+
        " ?p hc:nombre ?Periodo."+
        " FILTER regex(?estudiante,'"+ estudiante + "')"+
        "}";
    }
}
