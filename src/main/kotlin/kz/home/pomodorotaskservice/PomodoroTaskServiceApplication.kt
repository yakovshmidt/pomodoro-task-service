package kz.home.pomodorotaskservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class PomodoroTaskServiceApplication

fun main(args: Array<String>) {
	runApplication<PomodoroTaskServiceApplication>(*args)
}
