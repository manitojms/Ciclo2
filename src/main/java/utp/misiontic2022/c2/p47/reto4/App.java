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
