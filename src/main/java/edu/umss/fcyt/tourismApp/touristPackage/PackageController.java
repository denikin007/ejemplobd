package edu.umss.fcyt.tourismApp.touristPackage;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/package")
public class PackageController {

    private PackageRepository repository;

    @Inject
    public void setRepository(PackageRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(
            method = RequestMethod.POST)
        public ResponseEntity<?> addPackage(@RequestBody Package pack) {
        return new ResponseEntity<>(repository.save(pack), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Package> getPackageById(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/All", method = RequestMethod.GET)
    public List<Package> getPackageByAll() {
        return  repository.findAll();
    }
}