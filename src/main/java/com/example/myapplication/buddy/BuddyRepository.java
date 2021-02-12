package com.example.myapplication.buddy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "buddy", path = "buddy")
public interface BuddyRepository extends CrudRepository<BuddyInfo, Long> {

    List<BuddyInfo> findByPhoneNumber(@Param("phoneNumber") String phoneNumber);

}
