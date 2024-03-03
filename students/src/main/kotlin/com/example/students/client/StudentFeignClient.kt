package com.example.students.client

import com.example.students.dto.StudentDto
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "STUDENT-API", url = "\${external.student.api.base-url}")

interface StudentFeignClient {

    @GetMapping("/students")
    fun getStudents():List<StudentDto>

}