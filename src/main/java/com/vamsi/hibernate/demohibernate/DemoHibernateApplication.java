package com.vamsi.hibernate.demohibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vamsi.hibernate.demohibernate.manytomany.Delegate;
import com.vamsi.hibernate.demohibernate.manytomany.Event;
import com.vamsi.hibernate.demohibernate.repository.UserRepository;

@SpringBootApplication
public class DemoHibernateApplication implements CommandLineRunner {

	@Autowired
	UserRepository dao;

	private static final Logger logger = LoggerFactory.getLogger(DemoHibernateApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoHibernateApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// normal Hibernate check
		/*
		 * Student s = new Student("vamsi", "krishna", "vamsi@gmil.com");
		 * 
		 * Student s2 = new Student("vamsi", "krishna", "vamsi@gmil.com"); Student s3 =
		 * new Student("vamsi", "krishna", "vamsi@gmil.com"); Student s4 = new
		 * Student("vamsi", "krishna", "vamsi@gmil.com");
		 * 
		 * logger.info("inserting data -> {}", dao.insert(s));
		 * logger.info("inserting data -> {}", dao.insert(s2));
		 * logger.info("inserting data -> {}", dao.insert(s3));
		 * logger.info("inserting data -> {}", dao.insert(s4));
		 */

		// one class two tables test for hibernate

		/*
		 * Customer c = new Customer(); c.setCustomerName("balu");
		 * c.setCustomerAddress("Bangalore"); c.setCreditScore(780);
		 * c.setRewardPoints(10000); logger.info("inserting data -> {}",
		 * dao.cuinsert(c));
		 */

		// Two classes one table Test for hibernate

		/*
		 * SchoolDetails sDetails = new SchoolDetails();
		 * sDetails.setSchoolAddress("101 washington DC");
		 * sDetails.setPublicSchool(false); sDetails.setSchoolCount(300);
		 * 
		 * School s = new School(); s.setSchoolName("St .Anns School");
		 * s.setSchoolDetails(sDetails); logger.info("inserting data -> {}",
		 * dao.schoolInsert(s));
		 */

		// compoundkey hibernate test

		/*
		 * CompoundKey key = new CompoundKey(100, 30001);
		 * 
		 * Accounts a = new Accounts();
		 * 
		 * a.setCompoundKey(key); a.setAccountBalance(8500); dao.acInsert(a);
		 */

		// inheritance mapping for hibernate test

		/*
		 * Project p = new Project(); p.setProjectName("java"); dao.prInsert(p);
		 * 
		 * Module m = new Module(); m.setProjectName("javaM");
		 * m.setModuleName("CollectionM"); dao.mInsert(m);
		 * 
		 * Task t = new Task();
		 * 
		 * t.setProjectName("javaT"); t.setModuleName("collectioonT");
		 * t.setTaskName("Exception"); dao.tInsert(t);
		 */

		// one to one mapping for one direction and bidirectional
		/*
		 * PersonDetail pdetails = new PersonDetail();
		 * 
		 * pdetails.setZipcode("560103"); pdetails.setIncome(30000);
		 * pdetails.setJob("Software");
		 * 
		 * Person vamsi = new Person(); vamsi.setPersonName("vamsi");
		 * 
		 * vamsi.setPersonDetail(pdetails);
		 * 
		 * logger.info("entered data -> {}", dao.personInsert(vamsi));
		 */

		// one to many and many to one mapping

		/*
		 * College college = new College(); college.setCollegeName("Newyork College");
		 * 
		 * Student1 student1 = new Student1();
		 * 
		 * student1.setStudentName("Alex Rod");
		 * 
		 * Student1 student2 = new Student1();
		 * 
		 * student2.setStudentName("Linda Berry");
		 * 
		 * student1.setCollege(college); student2.setCollege(college);
		 * 
		 * logger.info("entered data -> {}", dao.collegeInsert(college));
		 * logger.info("entered data -> {}", dao.studentInsert(student1));
		 * logger.info("entered data -> {}", dao.studentInsert(student2));
		 */

		// many to many mapping for hibernate test

		Delegate delegate1 = new Delegate();
		delegate1.setDelegateName("Alex Rod");
		Delegate delegate2 = new Delegate();
		delegate2.setDelegateName("Linda Berry");
		Delegate delegate3 = new Delegate();
		delegate3.setDelegateName("john Doe");
		Delegate delegate4 = new Delegate();
		delegate4.setDelegateName("James Dean");

		Event java101 = new Event();
		java101.setEventName("Java - 101");
		Event cplus101 = new Event();
		cplus101.setEventName("C++ - 101");
		Event math101 = new Event();
		math101.setEventName("Math - 101");

		java101.getDelegates().add(delegate1);
		java101.getDelegates().add(delegate2);
		java101.getDelegates().add(delegate3);
		cplus101.getDelegates().add(delegate2);
		cplus101.getDelegates().add(delegate3);
		math101.getDelegates().add(delegate4);

		logger.info("entered data -> {}", dao.delegateInsert(delegate1));
		logger.info("entered data -> {}", dao.delegateInsert(delegate2));
		logger.info("entered data -> {}", dao.delegateInsert(delegate3));
		logger.info("entered data -> {}", dao.delegateInsert(delegate4));
		logger.info("entered data -> {}", dao.eventInsert(math101));
		logger.info("entered data -> {}", dao.eventInsert(cplus101));
		logger.info("entered data -> {}", dao.eventInsert(math101));

	}
}
