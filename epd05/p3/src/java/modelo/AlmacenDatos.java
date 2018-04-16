/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import modelo.Coche;
import modelo.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author susana
 */
public class AlmacenDatos {

    Session sesion = null;

    public AlmacenDatos() {
        sesion = HibernateUtil.getSessionFactory().openSession();
    }

    public List<Coche> consultaAparcamiento() throws SQLException {
        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        org.hibernate.Transaction tx = this.sesion.beginTransaction();
        Query q = sesion.createQuery("from Coche");
        List<Coche> listaCoches = q.list();
        tx.commit();

        return listaCoches;
    }

    public void insertarCoche(String matricula, String modelo, Time horaEntrada, Time horaSalida, int tiempoPermitido) throws SQLException {

        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();

        Coche v = new Coche(matricula, modelo, horaEntrada, horaSalida, tiempoPermitido);
        org.hibernate.Transaction tx = sesion.beginTransaction();

        sesion.save(v);
        tx.commit();

    }

    public int eliminarCoche(String matricula) throws SQLException {

        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        org.hibernate.Transaction tx = this.sesion.beginTransaction();
        Query q = sesion.createQuery("delete Coche where matricula= :matricula");
        q.setParameter("matricula", matricula);
        int result = q.executeUpdate();

        tx.commit();
        return result;

    }

    public void actualizarCoche(String matricula, String modelo, Time nuevaHoraEntrada, Time nuevaHoraSalida, int nuevoTiempoPermitido) throws SQLException {
        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        org.hibernate.Transaction tx = sesion.beginTransaction();

        Coche v = new Coche(matricula, modelo, nuevaHoraEntrada, nuevaHoraSalida, nuevoTiempoPermitido);

        sesion.update(v);
        tx.commit();

    }

    public List<Coche> consultarTiempoExcedido() throws SQLException {
        
        List<Coche> listaCoches = consultaAparcamiento();
        Coche coche = new Coche();
        long tiempoAparcado;
        List<Coche> cochesExceden = new ArrayList<>();
      
        
        for (Coche c : listaCoches) {
          
            if (c.getHoraSalida() != null) {
                tiempoAparcado = coche.tiempoEnMinutos(c);
                if (tiempoAparcado > c.getTiempoPermitido()) {
                    cochesExceden.add(c);
                }

            }
        }

        return cochesExceden;
    }
     public List<Coche> consultarTiempoNoExcedido() throws SQLException {
        
        List<Coche> listaCoches = consultaAparcamiento();
        Coche coche = new Coche();
        long tiempoAparcado;
        List<Coche> cochesExceden = new ArrayList<>();
       
        for (Coche c : listaCoches) {
          
            if (c.getHoraSalida() != null) {
                tiempoAparcado = coche.tiempoEnMinutos(c);
                if (tiempoAparcado <= c.getTiempoPermitido()) {
                    cochesExceden.add(c);
                }

            }
        }

        return cochesExceden;
    }
    

    public List<Coche> buscarPorMatricula(String matricula) throws SQLException {
        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        org.hibernate.Transaction tx = this.sesion.beginTransaction();
        Query q = sesion.createQuery("from Coche where matricula = :matricula");
        q.setParameter("matricula", matricula);
        List<Coche> listaCoches = q.list();
        tx.commit();

        return listaCoches;
    }

    public List<Coche> buscarCochesAparcados() throws SQLException {
        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        org.hibernate.Transaction tx = this.sesion.beginTransaction();
        Query q = sesion.createQuery("from Coche where hora_salida is NULL");

        List<Coche> listaCoches = q.list();
        tx.commit();

        return listaCoches;
    }
    
    
}
