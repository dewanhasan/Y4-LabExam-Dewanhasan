package ie.atu.student;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getStudent")
    public List<Student> getAllStudents() {
        return studentService.getStudent();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@Valid @RequestBody Student student) {
        studentService.addStudent(student);
        return student;
    }
}
