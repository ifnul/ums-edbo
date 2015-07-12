package org.lnu.ums.facade.person;

import org.lnu.ums.resource.person.EdboAutoEntrantResource;
import org.lnu.ums.resource.person.EdboManualEntrantResource;

/**
 * Interface for describing requests for edbo person.
 * @author ivanursul
 *
 */
public interface EntrantFacade {

	void createEntrantManually(EdboManualEntrantResource resource);

    void createEntrantAutomatically(EdboAutoEntrantResource resource);
}
