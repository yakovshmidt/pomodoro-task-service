package kz.home.pomodorotaskservice.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Task(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long,

    @Column(name = "start_time")
    private val startTime: LocalDateTime,

    @Column(name = "end_time")
    private val endTime: LocalDateTime,

    @Column(name = "is_finished")
    private val finished: Boolean
)