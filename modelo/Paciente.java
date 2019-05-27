package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Paciente extends Pessoa{
    protected int codigoPaciente;
    protected int emergencia;
    
    public void setCodigoPaciente(int cod){
        this.codigoPaciente = cod;
    }
    public int getCodigoPaciente(){
        return codigoPaciente;
    }
    
    public void setEmergencia(int em){
        this.emergencia = em;
    }
    
    public int getEmergencia(){
        return emergencia;
    }

    public void Fila_de_Prioridade(String nome){

    }
}
