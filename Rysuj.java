package lista1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Rysuj  {

    JFrame okno, okno_rysunek;
    JPanel panel;
    JButton sort1, sort2, sort3, sort4;
    InsertionSort obiekt;
    public InsertionSort proba;
    
    Narysuj rysunek;

    /**
     *
     */
    public Rysuj() {
        okno = new JFrame("Menu");
        sort1 = new JButton("Insertion sort");
        sort1.addActionListener(new insertionSort());
        sort2 = new JButton("Merge sort");
        sort3 = new JButton("Heap sort");
        sort4 = new JButton("Quick sort");
        panel = new JPanel();
        panel.add(sort1);
        panel.add(sort2);
        panel.add(sort3);
        panel.add(sort4);
        okno.add(panel);

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(500, 80);
        okno.setVisible(true);
    }

    public class insertionSort implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           
                obiekt = new InsertionSort();
                okno_rysunek=new JFrame();
                obiekt.losowy(2, 100, obiekt.ile = 5);
              //    obiekt.algorytm();
                rysunek = new Narysuj(obiekt.algorytm());
                obiekt.wyswietl();
                okno_rysunek.setContentPane(rysunek);
                okno_rysunek.setSize(400,400);
                okno_rysunek.setVisible(true);
         
        }
    }

    /**
     *
     * @param g
     */
  public  class Narysuj extends JPanel {
   public Narysuj(List lista){

   }
    
   @Override
        public void paintComponent(Graphics g) {
            int dlugosc;
            for (int i = 0; i < obiekt.ile; i++) {
                dlugosc = (int) obiekt.lista.get(i); //obiekt.lista 
                g.setColor(Color.black);
                g.drawLine(i * 10, 0, i * 10, dlugosc);
                okno_rysunek.repaint();
                
            }

        }
    }

 
}
