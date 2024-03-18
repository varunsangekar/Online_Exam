package edu.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.main.model.Mark;
import edu.main.repository.MarkRepository;
import edu.main.repository.StudentRepository;

@Service
public class MarkService {
	@Autowired
	MarkRepository markRepository;
	@Autowired
	StudentRepository studentRepository;

	public void saveMark(Mark mark) {
		markRepository.save(mark);
	}

	public List<Mark> getAllMarks() {
		return markRepository.findAll();
	}

	public Mark findBySid(int sid) {
		Optional<Mark> optionalMark = markRepository.findById(sid);
		return optionalMark.orElse(null);
	}
}
