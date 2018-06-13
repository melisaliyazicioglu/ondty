package com.project.yasar.onduty.domain;

import java.util.Date;
                               //foreign key yok 
import javax.persistence.*;

public class Project {
	
	 @Id   
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	 @Column
	    private String name;
	 @Column
	    private String surname;
	 @Column
	    private Date starttime;
	 @Column
	    private Date enddate;
	 @Enumerated(EnumType.ORDINAL)
	    private ProjectState projectstate;
	 @Enumerated(EnumType.ORDINAL)
	    private StateType statetype;
	
	
	
}
