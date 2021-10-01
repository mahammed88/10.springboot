package com.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.jpa.entity.CoustmerMasterEntity;
import com.jpa.repo.ContactMasterRepo;
import com.jpa.repo.CustomerMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
	ContactMasterRepo cp=	ctx.getBean(ContactMasterRepo.class);
	 System.out.println(cp.getClass().getName());
	 
	 CoustmerMasterEntity en=new CoustmerMasterEntity();
	 
	 en.setContactName("rani");
	 en.setContactNumber(12325);
	 
	 
	 CoustmerMasterEntity cus=cp.save(en);
	 System.out.println(cus);
	 
	 
	 
//	 
//	 int pageNo=1;
//	 int pageSize=3;
//	 
//	 PageRequest pgreq=PageRequest.of(pageNo, pageSize);
//	 
//	          Page<CoustmerMasterEntity> pd=   cp.findAll(pgreq);
//	                List<CoustmerMasterEntity> cont=         pd.getContent();
//	 
//	 
	 
	// List<CoustmerMasterEntity> cn=cp.findAll(Sort.by("contactName"));
	 
//	 cont.forEach(r->{
//		 System.out.println(r);
//	 });
	 
	 
	 
//	 String cn=cp.findContactNameByContactNumber(15462);
//	 System.out.println(cn);

//	 CoustmerMasterEntity entity=new CoustmerMasterEntity();
//	 
//	 
//	 entity.setCid(106);
//	 entity.setCname("babu");
//	 entity.setCnumber(12345);
//	 
//	 cp.save(entity);
	 
	 //cp.findbycname("babu");
	 
//	CoustmerMasterEntity name= cp.findbyContactNameIs("babu");
//	System.out.println(name);
	
//	 List<String> en= cp.findAllColumeNames();
//	en.forEach(name->{
//		System.out.println(name);
//	});
//	 
//	 Optional<CoustmerMasterEntity> en=cp.findById(101);
//	 System.out.println(en);
	 ctx.close();
	 
	
	}

}
