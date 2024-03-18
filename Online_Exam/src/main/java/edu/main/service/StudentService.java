package edu.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.main.model.Mark;
import edu.main.model.Student;
import edu.main.repository.MarkRepository;
import edu.main.repository.StudentRepository;
import jakarta.transaction.Transactional;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	@Autowired
	MarkRepository markRepository;

	public void Save(Student s) {
		sr.save(s);

	}

	public List<Student> getAllStudent() {

		return sr.findAll();
	}

	public Mark findBySid(int sid) {
		Optional<Mark> optionalMark = markRepository.findById(sid);
		return optionalMark.orElse(null);
	}

}
