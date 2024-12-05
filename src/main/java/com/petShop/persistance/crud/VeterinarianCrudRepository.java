package com.petShop.persistance.crud;

import com.petShop.persistance.entity.Veterinarian;
import org.springframework.data.repository.CrudRepository;

public interface VeterinarianCrudRepository extends CrudRepository<Veterinarian,Integer> {


}
