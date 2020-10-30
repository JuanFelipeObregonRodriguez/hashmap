/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huellitas;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author Juan Obregon
 */
public class Huellitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             HashMap<perro, Integer> hashMap = new HashMap<perro, Integer>();
        perro d1 = new perro("rojo");
        perro d2 = new perro("negro");
        perro d3 = new perro("blanco");
        perro d4 = new perro("gris");

        hashMap.put(d1, 10);
        hashMap.put(d2, 15);
        hashMap.put(d3, 5);
        hashMap.put(d4, 20);

        
        System.out.println(hashMap.size());

        
        for (Entry<perro, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }
    }
    

