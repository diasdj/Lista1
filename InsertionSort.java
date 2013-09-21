/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Paweł
 */
public class InsertionSort {
  
     public List lista = new ArrayList();
     public List tempLista = new ArrayList();
    int ile;
    Rysuj rysuj = new Rysuj();
    Rysuj.Narysuj tempRys;

    
    public void losowy(int min, int max, int ile) { // losuje dla podanego zakresu losowe liczby 

        int losuj;
        for (int i = 0; i < ile; i++) {
            losuj = (int) ((min) + Math.random() * (max - min) + 1);
            lista.add(losuj);
        }
        for (int j = 0; j < ile; j++) {
            int c;
            c = (int) (lista.get(j));
            System.out.println(c);
        }
        System.out.println("");
         

    }

    public List algorytm()  {
        int klucz, j, temp;
        for (int i = 1; i < ile; i++) {
            klucz = (int) (lista.get(i));
            j = i - 1;
            while (j >=0 && (int) lista.get(j) > klucz) {
                temp = (int) lista.get(j);
                lista.set(j + 1, temp);
                j = j - 1;
                lista.set(j + 1, klucz);
             
            }    tempRys = rysuj.new Narysuj(lista);
        }
         return null;
     
    }

    public void wyswietl()  {
        for (int g = 0; g < ile; g++) {
            int c;
            c = (int) (lista.get(g));
            System.out.println(c);
        }
    }

    
    }

 
    

