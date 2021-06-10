package com.github.nandem.ideaplugindocker.services

import com.github.nandem.ideaplugindocker.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
