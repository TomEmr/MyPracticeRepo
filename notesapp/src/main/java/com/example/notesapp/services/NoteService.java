package com.example.notesapp.services;

import com.example.notesapp.models.Note;
import com.example.notesapp.repositories.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    private final NoteRepo noteRepo;

    @Autowired
    public NoteService(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }

    public List<Note> listAll() {
        return noteRepo.findAll();
    }

    public Note save(Note note){
        return noteRepo.save(note);
    }
    public List<Note> listAllByType(String type){
        return noteRepo.findAllByType(type);
    }

    public Optional<Note> findById(Long id){
        return noteRepo.findById(id);
    }

//    podle Lukyho
//    delete by měl vracet Optional<Note> a měl bych ověřit podle ID
//    public Optional<Note> delete(Long id){
//        Optional<Note> optional = noteRepo.findById(id);
//        if (optional.isPresent()){
//            noteRepo.deleteById(id);
//        }
//        return optional;
//    }
    public void delete(Long id){
        noteRepo.deleteById(id);
    }
}
