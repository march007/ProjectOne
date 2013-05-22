package ru.vrn.com.shared.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ru.vrn.com.shared.model.superclass.Access;

@Entity
@Table(name = "AccessFileResourses")
//@AttributeOverride(name = "id", column = @Column(name = "ID"))
public class AccessFileResourses extends Access {
	
//	@Id
//    @GeneratedValue
//    private Long id;
	
	@OneToMany(mappedBy = "accessFileResourses", targetEntity = AccessFileResoursesDetail.class)
	private Set<AccessFileResoursesDetail> AccessFileResoursesDetailItems;

//	public Long getId() {
//		return id;
//	}

	public Set<AccessFileResoursesDetail> getAccessFileResoursesDetailItems() {
		return AccessFileResoursesDetailItems;
	}

//	public void setId(Long id) {
//		this.id = id;
//	}

	public void setAccessFileResoursesDetailItems(
			Set<AccessFileResoursesDetail> accessFileResoursesDetailItems) {
		AccessFileResoursesDetailItems = accessFileResoursesDetailItems;
	}
	
}
