/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Utilidades;

import java.lang.reflect.Field;

/**
 *
 * @author David Campoverde
 */
public class Utilidades {
    
    public static Boolean isNumber(Class clase){
        return clase.getSuperclass().getSimpleName().equalsIgnoreCase("Number");
    }
    
    public static Boolean isString(Class clase){
        return clase.getSimpleName().equalsIgnoreCase("String");
    }
    
    public static Boolean isCharacter(Class clase){
        return clase.getSimpleName().equalsIgnoreCase("Character");
    }
    
    public static Boolean isBoolean(Class clase){
        return clase.getSimpleName().equalsIgnoreCase("Boolean");
    }
    
    public static Boolean isPrimitive(Class clase){
        return clase.isPrimitive();
    }
    
    public static Boolean isObject(Class clase){
        return (!isPrimitive(clase) && !isBoolean(clase) && !isCharacter(clase) && !isNumber(clase) && !isString(clase));
    }
    
    public static Field obtenerAtributo(Class clase, String nombre){ //Devuelve que tipo de dato es el atributo enviado
        Field atributo = null;
        for(Field aux : clase.getDeclaredFields()){
            if(nombre.equalsIgnoreCase(aux.getName())){
                atributo = aux;
                break;
            }
        }
        return atributo;
    }
    
}
