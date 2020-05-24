package com.huangchuan.Activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;

import java.util.List;

public class ActivitiCompleteTask {
    public static void main(String[] args) {
        //1.得到processEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.taskservice对象
        TaskService taskService = processEngine.getTaskService();
       //3.处理任务，结合当前用户任务列表的查询操作的话，任务的ID5005
        taskService.complete("10002");

    }
}
