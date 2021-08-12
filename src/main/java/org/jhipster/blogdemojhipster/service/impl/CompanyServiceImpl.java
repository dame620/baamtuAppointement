package org.jhipster.blogdemojhipster.service.impl;

import java.util.List;
import java.util.Optional;
import org.jhipster.blogdemojhipster.domain.Company;
import org.jhipster.blogdemojhipster.repository.CompanyRepository;
import org.jhipster.blogdemojhipster.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Company}.
 */
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    private final Logger log = LoggerFactory.getLogger(CompanyServiceImpl.class);

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company save(Company company) {
        log.debug("Request to save Company : {}", company);
        return companyRepository.save(company);
    }

    @Override
    public Optional<Company> partialUpdate(Company company) {
        log.debug("Request to partially update Company : {}", company);

        return companyRepository
            .findById(company.getId())
            .map(
                existingCompany -> {
                    if (company.getName() != null) {
                        existingCompany.setName(company.getName());
                    }
                    if (company.getNinea() != null) {
                        existingCompany.setNinea(company.getNinea());
                    }
                    if (company.getRc() != null) {
                        existingCompany.setRc(company.getRc());
                    }
                    if (company.getAddress() != null) {
                        existingCompany.setAddress(company.getAddress());
                    }

                    return existingCompany;
                }
            )
            .map(companyRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Company> findAll() {
        log.debug("Request to get all Companies");
        return companyRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Company> findOne(Long id) {
        log.debug("Request to get Company : {}", id);
        return companyRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Company : {}", id);
        companyRepository.deleteById(id);
    }
}
