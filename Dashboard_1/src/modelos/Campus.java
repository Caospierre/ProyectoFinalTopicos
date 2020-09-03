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
public class Campus {

    public Campus() {
    }
    
    public String materiasDisponiblesEnCampus(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?Materia ?Campus "+
        "WHERE "+
        "{ "+
        " ?m hc:PerteneceAUna?c."+
        " ?c hc:EsparteDe ?d."+
        " ?d hc:EstaUbicadoEn?camp."+
        " ?m hc:nrc ?Materia."+
        " ?camp hc:nombre ?Campus"+
        "}";
    }
    
    public String estudiantesDelCampus(){
        return "PREFIX hc: <http://www.semanticweb.org/user/ontologies/2020/7/untitled-ontology-18#> "+
        "SELECT?Estudiante ?Campus "+
        "WHERE "+
        "{ "+
        " ?e hc:RealizaUna?ma."+
        " ?ma hc:RegistraUn?m."+
        " ?m hc:PerteneceAUna?c."+
        " ?c hc:EsparteDe ?d."+
        " ?d hc:EstaUbicadoEn?camp."+
        " ?e hc:nombre ?Estudiante."+
        " ?camp hc:nombre ?Campus"+
        "}";
    }
}
