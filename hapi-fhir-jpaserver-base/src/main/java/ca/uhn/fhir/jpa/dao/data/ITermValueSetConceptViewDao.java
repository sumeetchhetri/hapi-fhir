package ca.uhn.fhir.jpa.dao.data;

import ca.uhn.fhir.jpa.entity.ResourceSearchView;
import ca.uhn.fhir.jpa.entity.TermValueSetConceptView;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

/*
 * #%L
 * HAPI FHIR JPA Server
 * %%
 * Copyright (C) 2014 - 2019 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

public interface ITermValueSetConceptViewDao extends JpaRepository<TermValueSetConceptView, Long> {

	@Query("SELECT v FROM TermValueSetConceptView v WHERE v.myConceptValueSetPid = :pid AND v.myConceptOrder >= :from AND v.myConceptOrder < :to ORDER BY v.myConceptOrder")
	List<TermValueSetConceptView> findConceptsByValueSetPid(@Param("from") int theOffset, @Param("to") int theToIndex, @Param("pid") Long thePid);

}
