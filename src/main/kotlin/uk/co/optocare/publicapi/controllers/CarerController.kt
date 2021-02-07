package uk.co.optocare.publicapi.controllers

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class CarerController {

    @GetMapping(value = ["/carer"])
    fun getCarer(): String {
        return "carers"
    }

}