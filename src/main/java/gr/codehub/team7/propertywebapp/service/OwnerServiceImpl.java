package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.enums.Role;
import gr.codehub.team7.propertywebapp.forms.OwnerForm;
import gr.codehub.team7.propertywebapp.mappers.OwnerFormToOwnerMapper;
import gr.codehub.team7.propertywebapp.mappers.OwnerToOwnerModelMapper;
import gr.codehub.team7.propertywebapp.model.OwnerModel;
import gr.codehub.team7.propertywebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OwnerServiceImpl implements OwnerService{

    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private OwnerToOwnerModelMapper ownertoOwnerModel;

    @Autowired
    private OwnerFormToOwnerMapper ownerFormtoOwner;

    @Override
    public List<OwnerModel> getAllOwners() {

        return ownerRepository.findAll()
                .stream()
                .map(owner-> ownertoOwnerModel.map(owner))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<OwnerModel> findOwnerByEmail(String email) {

        return Optional.of(ownertoOwnerModel.map(ownerRepository.findOwnerByEmail(email).get()));
    }

    @Override
    public Optional<OwnerModel> findOwnerBySsn(String ssn) {

        return Optional.of(ownertoOwnerModel.map(ownerRepository.findOwnerBySsn(ssn).get()));
    }

    @Override
    public OwnerModel insertOwner(OwnerForm ownerForm) {

        return ownertoOwnerModel.map(ownerRepository.save(ownerFormtoOwner.map(ownerForm)));
    }

    @Override
    public OwnerModel updateOwner(OwnerForm ownerForm, Long id) {
        Owner owner=ownerFormtoOwner.map(ownerForm);
        if(ownerRepository.findById(id).isPresent()){
            owner.setId(id);
            return ownertoOwnerModel.map( ownerRepository.save(owner));
        }
        return null;
    }

    @Override
    public void deleteOwnerById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Optional<OwnerModel> findOwnerById(Long id) {
        return Optional.of(ownertoOwnerModel.map(ownerRepository.findById(id).get()));
    }

}
