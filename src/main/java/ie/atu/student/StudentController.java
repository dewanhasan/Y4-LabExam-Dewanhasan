package ie.atu.student;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private EnrolmentClient enrolmentClient;
    private StudentService studentService;

    public StudentController(EnrolmentClient enrolmentClient, StudentService studentService) {
        this.enrolmentClient = enrolmentClient;
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

    @PostMapping("/student-enrolment")
    public String studentEnrolment(@RequestBody Student student){
        String student = enrolmentClient.studentDetails();
    }

}
