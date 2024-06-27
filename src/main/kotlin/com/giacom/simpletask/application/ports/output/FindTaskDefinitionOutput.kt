package com.giacom.simpletask.application.ports.out

import com.giacom.simpletask.application.core.domain.TaskDefinition
import java.util.*

interface FindTaskDefinitionOutput {
    fun findById(id: Long): Optional<TaskDefinition>
}