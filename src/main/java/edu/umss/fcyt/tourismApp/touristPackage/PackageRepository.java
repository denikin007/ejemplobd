package edu.umss.fcyt.tourismApp.touristPackage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface PackageRepository extends JpaRepository<Package, Long>
{
	List<Package> findByName(String name);
}