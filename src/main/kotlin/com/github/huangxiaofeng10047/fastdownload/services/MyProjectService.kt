package com.github.huangxiaofeng10047.fastdownload.services

import com.github.huangxiaofeng10047.fastdownload.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
