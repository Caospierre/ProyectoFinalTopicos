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
public class Docente {

    public Docente() {
    }
    
    public String materiasDelDocente(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?docente?Nrc "+
        "WHERE "+
        "{ "+
        " ?d hc:EsAsignadoA?n."+
        " ?d hc:nombre ?docente."+
        " ?n hc:nrc ?Nrc"+
        "}";
    }
    
    public String horarioDelDocente(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?Docente ?HoraInicio ?HoraFin ?Dia "+
        "WHERE "+
        "{ "+
        " ?d hc:EsAsignadoA?m."+
        " ?m hc:EsDictadaEn?h."+
        " ?d hc:nombre ?Docente."+
        " ?h hc:horaInicio ?HoraInicio."+
        " ?h hc:horaFin ?HoraFin."+
        " ?h hc:dia ?Dia"+
        "}";
    }
    
    public String parametroMateriasDelDocente(String docente){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?docente?Nrc "+
        "WHERE "+
        "{ "+
        " ?n hc:EsDictadoPor?d."+
        " ?d hc:nombre ?docente."+
        " ?n hc:nrc ?Nrc."+
        " FILTER regex(?docente,'"+ docente + "')"+
        "}";
    }
    
    public String parametroHorarioDelDocente(String docente){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?Docente ?HoraInicio ?HoraFin ?Dia "+
        "WHERE "+
        "{ "+
        " ?m hc:EsDictadoPor?d."+
        " ?m hc:EsDictadaEn?h."+
        " ?d hc:nombre ?Docente."+
        " ?h hc:horaInicio ?HoraInicio."+
        " ?h hc:horaFin ?HoraFin."+
        " ?h hc:dia ?Dia."+
        " FILTER regex(?Docente,'"+ docente + "')"+
        "}";
    }
    
    
}
