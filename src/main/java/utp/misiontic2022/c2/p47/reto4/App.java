package utp.misiontic2022.c2.p47.reto4;

import java.awt.EventQueue;

import utp.misiontic2022.c2.p47.reto4.vista.VistaRequerimientosReto4;


public class App {
    public static void main( String[] args ){        
        
        // Ejecutar Swing en otro hilo
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                try{
                    utp.misiontic2022.c2.p47.reto4.vista.VistaRequerimientosReto4 frame = new VistaRequerimientosReto4();
                    frame.setVisible(true);
                } catch(Exception e){
                    e.printStackTrace();
                }
                
            }
            
        });
        
    }

}

/**package utp.misiontic2022.c2.p47.reto4;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.vista.ModeloDatos;



public class App 
{
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    public static void main( String[] args )
    {
       System.out.println("Requerimiento 1");
        VistaRequerimientosReto4.requerimiento1();

       System.out.println("\nRequerimiento 2");
        VistaRequerimientosReto4.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientosReto4.requerimiento3();
        
        ModeloDatos modelo = new ModeloDatos();
        try {
            ArrayList <Compras> lista = controlador.consultarRequerimiento1();
            Object matriz[][] =  new Object [lista.size()][2];
            for(int i = 0 ; i < lista.size();i++){
                matriz[i][0] = lista.get(i).getID_Compra();
                matriz[i][1] = lista.get(i).getProveedor();
            }
            modelo.datos = matriz;
            jLabel1 = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            JTable tabla = new JTable(modelo);
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);

            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}*/


