/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoescola;

import java.util.regex.PatternSyntaxException;

/**
 *
 * @author Viksóm
 */
public class Contacto {
    public String Numero;
    
    public Contacto(String numero) {
        this.Numero = numero;
        if(!numero.contains("+244")) {
            this.Numero = "+244" + numero;
        }
    }
}
