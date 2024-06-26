package com.giacom.simpletask.adapters.output

import com.giacom.simpletask.adapters.output.repository.TaskDefinitionRepository
import com.giacom.simpletask.adapters.output.repository.mapper.TaskDefinitionEntityMapper
import com.giacom.simpletask.application.core.domain.TaskDefinition
import com.giacom.simpletask.application.ports.output.FindTaskDefinitionOutput
import org.springframework.stereotype.Component
import java.util.*

@Component
class FindTaskDefinitionAdapter(
    private val repository: TaskDefinitionRepository,
    private val mapper: TaskDefinitionEntityMapper
) : FindTaskDefinitionOutput {

    override fun findById(id: Long): Optional<TaskDefinition> {
        val taskDefinitionEntity = repository.findById(id)
        return taskDefinitionEntity.map { mapper.toDomain(it) }
    }

    override fun findAll(): List<TaskDefinition> {
        return repository.findAll().map { mapper.toDomain(it) }
    }

}
