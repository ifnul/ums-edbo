package org.lnu.is.domain.person.language;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.language.LanguageLevel;
import org.lnu.is.domain.person.Person;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Person Language entity.
 * @author ivanursul
 *
 */
@OD
@Entity
@Table(name = "q_od_personlanguage")
public class PersonLanguage extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	
	@ManyToOne
	@JoinColumn(name = "languagelevel_id")
	private LanguageLevel languageLevel;

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(final Language language) {
		this.language = language;
	}

	public LanguageLevel getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(final LanguageLevel languageLevel) {
		this.languageLevel = languageLevel;
	}
	
}
