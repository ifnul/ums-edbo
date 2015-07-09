package org.lnu.is.domain.department.specialty;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.specialty.Specialty;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Department specialty entity.
 * @author ivanursul
 *
 */
@OD
@Entity
@Table(name = "q_od_departmentspecialty")
public class DepartmentSpecialty extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "specialty_id")
	private Specialty specialty;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(final Department department) {
		this.department = department;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(final Specialty specialty) {
		this.specialty = specialty;
	}
	
}
