package com.blakegifford.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blakegifford.languages.models.Language;
import com.blakegifford.languages.repositories.LanguageRepository;
	
	@Service
	public class LanguageService {
	    // adding the Language repository as a dependency
	    private final LanguageRepository LanguageRepository;
	    
	    public LanguageService(LanguageRepository LanguageRepository) {
	        this.LanguageRepository = LanguageRepository;
	    }
	    
	    // returns all the Languages
	    public List<Language> allLanguages() {
	        return LanguageRepository.findAll();
	    }
	    
	    // creates a Language
	    public Language createLanguage(Language l) {
	        return LanguageRepository.save(l);
	    }
	    
	    public Language findOneById(Long id) {
	    	Optional<Language> optionalLanguage = LanguageRepository.findById(id);
	    	if(optionalLanguage.isPresent()) {
	            return optionalLanguage.get();
	        } else {
	            return null;
	        }
	    }
	    
	    // retrieves a Language
	    public Language findLanguage(Long id) {
	        Optional<Language> optionalLanguage = LanguageRepository.findById(id);
	        if(optionalLanguage.isPresent()) {
	            return optionalLanguage.get();
	        } else {
	            return null;
	        }
	    }



	public void updateLanguage(Long id, String name, String creator, String version) {
		// TODO Auto-generated method stub
		
	}
}