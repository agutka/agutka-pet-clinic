package com.agutka.agutkapetclinic.services;

import com.agutka.agutkapetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
