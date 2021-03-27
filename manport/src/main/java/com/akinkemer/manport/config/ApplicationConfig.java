package com.akinkemer.manport.config;

import com.akinkemer.manport.domain.Application;
import com.akinkemer.manport.domain.Country;
import com.akinkemer.manport.domain.Job;
import com.akinkemer.manport.domain.Production;
import com.akinkemer.manport.enums.app.*;
import com.akinkemer.manport.enums.job.JobStatus;
import com.akinkemer.manport.repository.ApplicationRepository;
import com.akinkemer.manport.repository.CountryRepository;
import com.akinkemer.manport.repository.JobRepository;
import com.akinkemer.manport.repository.ProductionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class ApplicationConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            ApplicationRepository repository,
            CountryRepository countryRepository,
            ProductionRepository productionRepository,
            JobRepository jobRepository
            ) {
        return args -> {
            //ilk önce bişeyi kaydet sonra set ile ata
            //Aynı şeyi geçeseksen db den çek tekrar ver
            //db çekmeden önce bir kayıttan sonra id al tekrar çek
            Country c=new Country("A",
                    "AB",
                    Arrays.asList());
            countryRepository.save(c);
            Application cvqs = new Application("Free Location Rack System",
                    "FLR",
                    "Akın Kemer",
                    75,
                    15,
                    true,
                    Calendar.getInstance().getTime(),
                    BusinessArea.MANUFACTURING,
                    ResponsibleTeam.MANUFACTURING_SYTEMS,
                    Backend.PL_SQL,
                    Frontend.APACHE_WICKET,
                    Database.ORACLE,
                    Arrays.asList(new Job(),new Job()));
            repository.save(cvqs);

            Production p=new Production();
            productionRepository.save(p);

            cvqs.setJobs(Arrays.asList(new Job("BEN",JobStatus.LOW)));
            repository.save(cvqs);

            Job a=jobRepository.findByName("BEN");

            p.setJobs(Arrays.asList(a));
            p.setCountry(c);
            Long pId=p.getId();
            productionRepository.save(p);


            Production p2=productionRepository.findProductionById(pId);
            c.setProductions(Arrays.asList(p2));
            countryRepository.save(c);

















        };
    }
}
