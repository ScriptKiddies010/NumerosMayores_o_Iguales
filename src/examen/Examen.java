/*
Imprimir en pantalla 5 numeros aleatorios del 1 al 100,  Imprime en pantalla cuantos numeros fueron mayores o iguales a 50, Utilizando un arreglo. 
*/

package examen;

 import java.sql.*;
 import javax.swing.*;
 import java.awt.Container;
 import java.awt.FlowLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;

     class Examen extends JFrame implements ActionListener{
    
         int arreglo[]=new int [5];
     
         JButton btimprimir;
         JLabel lbclave;
         JTextField tfclave;

     public Examen(){
         super("Consultar");
            Container contenedor=getContentPane();
            contenedor.setLayout(new FlowLayout());
            btimprimir= new JButton("Imprimir num mayores o iguales a 50");
            lbclave= new JLabel(">=50");
            tfclave= new JTextField(5);
            
            contenedor.add(btimprimir);    
            contenedor.add(lbclave);
            contenedor.add(tfclave);
        
                    
            btimprimir.addActionListener(this);
            setVisible (true);
            setSize(200,300); 
    }
     public void actionPerformed(ActionEvent e){
         int num,a,i,r,acu=0;
        
           
        
        for(i=0;i<=arreglo.length;i++){
            if(i>4){ 
         break;
                 }
        a=(int)(Math.random()*100);//imprime numeros aleatorios del 1 al 100
        arreglo[i]=a;
           
           JOptionPane.showMessageDialog(null,""+arreglo[i]);
            System.out.println(arreglo[i]);
           
            if (arreglo[i]>=50){
                acu=acu+1;
                
                tfclave.setText(""+acu);
                
            }
        } //final for
        
     
     }//final de actionPreformed
     
    public static void main(String[] args) {
     Examen g=new Examen(); //se crea instancia
    }

  
  }

