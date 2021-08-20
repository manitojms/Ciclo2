package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Compras2Dao {
    Connection conexion;

    public Compras2Dao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public ArrayList<Compras2> comprasp() throws SQLException {
        ArrayList<Compras2> lista = new ArrayList<Compras2>();
        String sql = "SELECT ID_Compra FROM Compra JOIN MaterialConstruccion USING (ID_MaterialConstruccion) WHERE Precio_Unidad < 1100";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        while(resultado.next()){
            Compras2 compra = new Compras2();
            compra.setID_Compra(resultado.getInt(1));
            /*.setProveedor(resultado.getString(2));*/
            lista.add(compra);
        }
        return lista;
    }
}