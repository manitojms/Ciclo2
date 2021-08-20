package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Compras3Dao {
    Connection conexion;
    private boolean add;

    public Compras3Dao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public ArrayList<Compras3> comprasfecha() throws SQLException {
        ArrayList<Compras3> lista = new ArrayList<Compras3>();
        String string = "SELECT ID_Proyecto, STRFTIME('%Y',Fecha ) FROM Compra WHERE Pagado = 'Parcialmente' AND STRFTIME('%m',Fecha) = '02'";
        String sql = string;
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        while(resultado.next()){
            Compras3 comprita = new Compras3();
            comprita.setID_Compra(resultado.getInt(1));
            comprita.setFecha(resultado.getInt(2));
            lista.add(comprita);
        }
        return lista;
    }
}