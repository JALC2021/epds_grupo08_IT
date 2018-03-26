
package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class Parking {

    Session session = null;

    public List<CocheModelo> consultaAparcamiento() throws SQLException {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        List<CocheModelo> lista = new ArrayList<>();
        org.hibernate.Transaction tx = this.session.beginTransaction();
        Query q = session.createQuery("from Vehiculo");
        lista = q.list();
        tx.commit();

        return lista;
    }

    public void addVehiculoBD(String matricula, String modelo, String horaEntrada, String horaSalida, int tiempoPermitido) throws SQLException {

        this.session = HibernateUtil.getSessionFactory().getCurrentSession();

        CocheModelo v = new CocheModelo(matricula, modelo, horaEntrada, horaSalida, tiempoPermitido);
        org.hibernate.Transaction tx = session.beginTransaction();

        session.save(v);
        tx.commit();

    }

    public int deleteVehiculoBD(String matric) throws SQLException {
        
        
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        org.hibernate.Transaction tx = this.session.beginTransaction();
        Query q = session.createQuery("delete Vehiculo where matricula= :matr");
        q.setParameter("matr", matric);
        int result = q.executeUpdate();
  
        tx.commit();

        return result;

    }

    public void updateVehiculoBD(String matricula, String modelo,String nuevaHoraEntrada, String nuevaHoraSalida, int nuevoTiempoPermitido) throws SQLException {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();

        org.hibernate.Transaction tx = session.beginTransaction();

        CocheModelo v = new CocheModelo(matricula, modelo, nuevaHoraEntrada, nuevaHoraSalida, nuevoTiempoPermitido);

        session.update(v);
        tx.commit();

    }

}
