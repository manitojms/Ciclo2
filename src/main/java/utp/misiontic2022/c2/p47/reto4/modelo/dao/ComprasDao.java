package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class ComprasDao {

    Connection conexion;

    public ComprasDao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public ArrayList<Compras> compraspagadas() throws SQLException {
        ArrayList<Compras> lista = new ArrayList<Compras>();
        String sql = "SELECT ID_Compra, Proveedor FROM Compra WHERE Pagado = 'No' AND Proveedor = 'JUMBO'";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        while(resultado.next()){
            Compras compra = new Compras();
            compra.setID_Compra(resultado.getInt(1));
            compra.setProveedor(resultado.getString(2));
            lista.add(compra);
        }
        return lista;
    }
    public ArrayList<Compras2> comprasp() {
        return null;
    }
}