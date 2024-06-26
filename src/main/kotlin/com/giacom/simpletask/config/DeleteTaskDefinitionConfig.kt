package com.giacom.simpletask.config

import com.giacom.simpletask.application.core.usecase.DeleteTaskDefinitionUseCase
import com.giacom.simpletask.application.ports.output.DeleteTaskDefinitionOutput
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeleteTaskDefinitionConfig {

    @Bean
    fun deleteTaskDefinitionInput(deleteTaskDefinitionOutput: DeleteTaskDefinitionOutput): DeleteTaskDefinitionUseCase {
        return DeleteTaskDefinitionUseCase(deleteTaskDefinitionOutput)
    }

}
