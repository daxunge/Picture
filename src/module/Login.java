package module;

import bean.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Administrator on 2017/4/30.
 */
public class Login {
    private static HibernateInit hibernateInit ;

    public void setHibernateInit(HibernateInit hibernateInit) {
        this.hibernateInit = hibernateInit;
    }

    public static String register (User user){
        Session session = hibernateInit.getSession();
        if (checkuser(user.getUserName(),user.getUserPwd())){
            return "已注册";
        }
        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            return "注册成功";
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            HibernateInit.close(session);
        }
        return "注册失败";
    }
    public static boolean checkuser(String password,String username){
        Session session = hibernateInit.getSession();
        try {

            session.beginTransaction();
            String hql = "from User user where user.userName=:userName and user.userPwd=:userPwd";
            Query query  = session.createQuery(hql).setParameter("userName",username).setParameter("userPwd",password);
            List list = query.list();
            if (list.size()==0){
                return false;
            }else if (list.size()>1){
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("数据库内包含两个重复数据");
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            HibernateInit.close(session);

        }
        return  false;
    }
}
