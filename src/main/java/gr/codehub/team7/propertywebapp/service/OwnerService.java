package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.forms.OwnerEditForm;
import gr.codehub.team7.propertywebapp.forms.OwnerForm;
import gr.codehub.team7.propertywebapp.model.OwnerModel;

import java.util.List;
import java.util.Optional;

public interface OwnerService {


    List<OwnerModel> getAllOwners();
    Optional<OwnerModel> findOwnerByEmail(String email);
    Optional<OwnerModel> findOwnerBySsn(String ssn);

    OwnerModel insertOwner(OwnerForm ownerForm);
    OwnerModel updateOwner(OwnerEditForm ownerForm, Long id);

    void deleteOwnerById(Long id);

    Optional<OwnerModel> findOwnerById(Long id);

//    List<OwnerModel> findOwnerBySsn(String ssn);

//    List<Owner> findOwnerByEmail(String email);
}
