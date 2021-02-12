package com.example.myapplication.buddy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "addressBook", path = "addressBook")
public interface AddressRepository extends CrudRepository<BuddyInfo, Long> {

    public List<BuddyInfo> findAll();
    public long count();
    public void deleteById(Long id);
    public void findByName(String name);
    public void deleteByName(String name);

}
