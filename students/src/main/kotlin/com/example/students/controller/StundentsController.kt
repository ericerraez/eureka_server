package com.example.students.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

class StudentsController {

}@RestController
@RequestMapping("/students")
class StudentCotroller {

    @GetMapping
    fun list():String{
        return "estudiantes"
    }
}