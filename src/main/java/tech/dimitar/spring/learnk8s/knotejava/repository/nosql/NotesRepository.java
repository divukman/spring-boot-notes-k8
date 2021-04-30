package tech.dimitar.spring.learnk8s.knotejava.repository.nosql;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.dimitar.spring.learnk8s.knotejava.domain.nosql.Note;

public interface NotesRepository extends MongoRepository<Note, String> {

}