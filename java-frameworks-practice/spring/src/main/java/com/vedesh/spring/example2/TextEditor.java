package com.vedesh.spring.example2;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
    private SpellChecker spellChecker;
 
    public TextEditor(SpellChecker spellChecker){
       System.out.println("Inside TextEditor constructor." );
       this.spellChecker = spellChecker;
    }
    public void spellCheck(){
       spellChecker.checkSpelling();
    }
 }