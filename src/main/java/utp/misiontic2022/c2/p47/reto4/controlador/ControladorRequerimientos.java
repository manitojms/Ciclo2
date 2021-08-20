package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.ComprasDao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Compras2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Compras3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras3;

public class ControladorRequerimientos {
    ComprasDao dao = new ComprasDao();
    Compras2Dao dao2 = new Compras2Dao();
    Compras3Dao dao3 = new Compras3Dao();
    
    public ArrayList<Compras> consultarRequerimiento1() throws SQLException {
        return dao.compraspagadas();
    }
    
    public ArrayList<Compras2> consultarRequerimiento2() throws SQLException {
        return dao2.comprasp();
    }

   
    public ArrayList<Compras3> consultarRequerimiento3() throws SQLException {
        return dao3.comprasfecha();
    }

}
