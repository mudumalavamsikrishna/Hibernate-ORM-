package com.vamsi.hibernate.demohibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vamsi.hibernate.demohibernate.compoundkey.Accounts;
import com.vamsi.hibernate.demohibernate.inheritancemapping.Module;
import com.vamsi.hibernate.demohibernate.inheritancemapping.Project;
import com.vamsi.hibernate.demohibernate.inheritancemapping.Task;
import com.vamsi.hibernate.demohibernate.manytomany.Delegate;
import com.vamsi.hibernate.demohibernate.manytomany.Event;
import com.vamsi.hibernate.demohibernate.oneclasstwotables.Customer;
import com.vamsi.hibernate.demohibernate.onetomany.College;
import com.vamsi.hibernate.demohibernate.onetomany.Student1;
import com.vamsi.hibernate.demohibernate.onetoonemapping.Person;
import com.vamsi.hibernate.demohibernate.twoclassonetable.School;

@Repository
@Transactional
public class UserRepository {

	@PersistenceContext
	EntityManager entityManager;
	/*
	 * public Student insert(Student student) { return entityManager.merge(student);
	 * }
	 */

	public Customer cuinsert(Customer customer) {

		return entityManager.merge(customer);
	}

	public School schoolInsert(School school) {

		return entityManager.merge(school);
	}

	public Accounts acInsert(Accounts accounts) {

		return entityManager.merge(accounts);
	}

	public Project prInsert(Project project) {
		return entityManager.merge(project);
	}

	public Module mInsert(Module module) {
		return entityManager.merge(module);
	}

	public Task tInsert(Task task) {
		return entityManager.merge(task);
	}

	public Person personInsert(Person person) {
		return entityManager.merge(person);
	}

	public College collegeInsert(College college) {

		return entityManager.merge(college);
	}

	public Student1 studentInsert(Student1 student) {

		return entityManager.merge(student);
	}

	public Delegate delegateInsert(Delegate deleagte) {

		return entityManager.merge(deleagte);
	}

	public Event eventInsert(Event event) {

		return entityManager.merge(event);
	}
}
