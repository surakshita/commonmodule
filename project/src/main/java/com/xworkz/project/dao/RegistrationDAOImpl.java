package com.xworkz.project.dao;



import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.RegistrationEntity;
@Repository
public class RegistrationDAOImpl implements RegistrationDAO {

	private Logger logger;
	@Autowired
	private SessionFactory bean;
	
	
	public RegistrationDAOImpl() {
	logger=Logger.getLogger(getClass());
	}

	@Override
	public Integer saveEntity(RegistrationEntity registrationEntity) {
		Transaction transaction=null;
		Integer rowsEffected=0;
		try(Session session=bean.openSession()) {
			transaction=session.beginTransaction();
			rowsEffected=(Integer) session.save(registrationEntity);
		    transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			logger.error("Exception occured in {}"+e.getMessage(),e);
		}
		return rowsEffected;
	}

	@Override
	public RegistrationEntity getByEmailId(String emailId) {
		Transaction transaction=null;
		Session session=null;
		RegistrationEntity registrationEntity=null;
		try {
			session=bean.openSession();
			Query query=session.createNamedQuery("getByEmailId");
			query.setParameter("email", emailId);
			registrationEntity=(RegistrationEntity) query.uniqueResult();
		} catch (Exception e) {
			logger.error("Exceprtion at {}"+e.getMessage(),e);
		}finally {
			if (session!=null) {
				session.close();
				
			}
		}
		return registrationEntity;
	}

}
