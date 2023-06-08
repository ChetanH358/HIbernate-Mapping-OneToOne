package com.yt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chetan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		AdharCard adharCard = new AdharCard();
		adharCard.setAid(31229874);
		adharCard.setAddress("hubballi");
		
		Person person = new Person();
		person.setName("chinmay");
		person.setAge(21);
		person.setPhno(9117447436l);
		person.setGender("male");
		person.setCard(adharCard);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(adharCard);
		entityTransaction.commit();
		
	}

}
