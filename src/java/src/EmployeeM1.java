package src;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author abdel
 */
public class EmployeeM1 {
    public void addEmp(Employee a){
        Transaction trans = null;
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trans = se.beginTransaction();
            se.save(a);
            se.getTransaction().commit();
        } catch (RuntimeException e) {
            if(trans != null){
                trans.rollback();
            }
            e.printStackTrace();
        }finally{
            se.flush();
            se.close();
        }
    }
}
