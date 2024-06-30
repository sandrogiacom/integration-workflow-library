package com.giacom.simpletask.adapters.output.repository.entity

import jakarta.persistence.*

@Entity
@Table(name = "task_attribute_definition")
data class TaskAttributeDefinitionEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val attributeName: String,
    @ManyToOne
    @JoinColumn(name = "task_definition_id")
    val taskDefinitionEntity: TaskDefinitionEntity
)
