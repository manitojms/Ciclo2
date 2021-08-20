package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class VistaRequerimientosReto4 extends JFrame{
    
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    
    // Mitigar errores de instancias serializable
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea;

    public VistaRequerimientosReto4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 200, 800,650);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10,10,10,10));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbltitulo = new JLabel("RETO 5");
        lbltitulo.setBounds(28, 16, 61, 16);
        contentPane.add(lbltitulo);

        // Dimensiona el contenido dentro de la ventana
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 70, 737, 455);
        contentPane.add(scrollPane);

        // Proporciona una vista desplazable de un componente en una ventana grafica
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        JButton btnConsuta1 = new JButton("Consulta 1");
        btnConsuta1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento1();
            }
        });
        btnConsuta1.setBounds(20, 537, 133, 29);
        contentPane.add(btnConsuta1);

        JButton btnConsuta2 = new JButton("Consulta 2");
        btnConsuta2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento2();
            }
        });
        btnConsuta2.setBounds(157, 537, 133, 29);
        contentPane.add(btnConsuta2);

        JButton btnConsuta3 = new JButton("Consulta 3");
        btnConsuta3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento3();
            }
        });
        btnConsuta3.setBounds(294, 537, 133, 29);
        contentPane.add(btnConsuta3);

        JButton btnLimpiar = new JButton("Borrar datos");
        btnLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        btnLimpiar.setBounds(648, 537, 117, 29);
        contentPane.add(btnLimpiar);

    }

    public void requerimiento1(){
        try{
            ArrayList<Compras> rankingCompras = controlador.consultarRequerimiento1();
            String salida = "*** Id de las compras que NO estén pagadas y Proveedor 'JUMBO'*** \n\nID_Compra\tProveedor\n\n";
            for (Compras compras : rankingCompras){
                salida += compras.getID_Compra();
                salida += "\t";
                salida += compras.getProveedor();
                salida += "\n";
            }
            textArea.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public void requerimiento2(){
        try{
            ArrayList<Compras2> rankingCompras2 = controlador.consultarRequerimiento2();
            String salida = "*** Conocer el id de todas las compras cuyo precio por unidad de su material de construcción sea inferior a 1100 *** \n\nID_Compra\n\n";
            for (Compras2 compras2 : rankingCompras2){
                salida += compras2.getID_Compra();
                salida += "\n";
            }
            textArea.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public void requerimiento3(){
        try{
            ArrayList<Compras3> rankingCompras3 = controlador.consultarRequerimiento3();
            String salida = "*** id de la compra y el año de las compras pagadas parcialmente y en el mes '02' *** \n\nID_Compra\tAño\n\n";
            for (Compras3 compras3 : rankingCompras3){
                salida += compras3.getID_Compra();
                salida += "\t";
                salida += compras3.getFecha();
                salida += "\n";
            } 
            textArea.setText(salida);   
        
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
/**
public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            System.out.println("Conocer el id de las compras que si estén pagadas");
            ArrayList<Compras> resultado = controlador.consultarRequerimiento1();
            System.out.println("ID_Compra, Proveedor");
            for(Compras compras:resultado){
                System.out.print(compras.getID_Compra()+" ");
                System.out.println(compras.getProveedor());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            System.out.println("Conocer el id de todas las compras cuyo precio por unidad de su material de construcción sea inferior a 1100");
            ArrayList<Compras2> resultado = controlador.consultarRequerimiento2();
            System.out.println("ID_Compra");
            for(Compras2 compras:resultado){
                System.out.println(compras.getID_Compra());
                System.out.println(compras.getProveedor());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            System.out.println("Obtener Id de la compra y el año de las compras pagadas parcialmente y en el mes '02'");
            ArrayList<Compras3> resultado = controlador.consultarRequerimiento3();
            System.out.println("ID_Compra Fecha");
            for(Compras3 compritas:resultado){
                System.out.print(compritas.getID_Compra()+" ");
                System.out.println(compritas.getFecha());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
*/