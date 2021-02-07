package uk.co.optocare.publicapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("uk.co.optocare.publicapi.entities")
open class CarerApiApplication

fun main(args: Array<String>) {
	runApplication<CarerApiApplication>(*args)
}
