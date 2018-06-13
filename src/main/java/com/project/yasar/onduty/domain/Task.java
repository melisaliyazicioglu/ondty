package com.project.yasar.onduty.domain;

import javax.persistence.*;
import java.util.Date;

@Entity // maping class yaz�p �a��rcaz 
public class Task {

	
	 @Id   
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	 @Column
	    private String name;
	 @Column
	 
	 @Enumerated(EnumType.ORDINAL)
	    private TaskStateType taskstatetype; 
	
	 @Column
	 private String assignerpersonal;
	
	 @Column
	    @Enumerated(EnumType.ORDINAL)
	    private TaskPriority taskpriority; 
	 
	 @JoinColumn(name = "projectid")
	    private Project project;   
	 //ba�lant� yap�lcak 
	 @Column
	 private Date taskstartdate;
	 @Column
	 private Date taskenddate;
	 
}
	
