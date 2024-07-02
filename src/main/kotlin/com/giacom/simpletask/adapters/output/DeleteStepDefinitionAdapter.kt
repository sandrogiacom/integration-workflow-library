package com.giacom.simpletask.adapters.output

import com.giacom.simpletask.adapters.output.repository.TaskDefinitionRepository
import com.giacom.simpletask.adapters.output.repository.TaskStepDefinitionRepository
import com.giacom.simpletask.application.ports.output.DeleteTaskDefinitionOutput
import com.giacom.simpletask.application.ports.output.DeleteTaskStepDefinitionOutput
import org.springframework.stereotype.Component

@Component
class DeleteStepDefinitionAdapter(
    private val repository: TaskDefinitionRepository
) : DeleteTaskDefinitionOutput {

    override fun deleteById(id: Long) {
        repository.deleteById(id)
    }

}
