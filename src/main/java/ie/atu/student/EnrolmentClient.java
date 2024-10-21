package ie.atu.student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="enrolment-service", url="http://localhost:8082")
public interface EnrolmentClient {
    @PostMapping("/student")
    String studentDetails(@RequestBody Student student);
}
