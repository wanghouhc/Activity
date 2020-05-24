package com.huangchuan.Activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

import java.util.List;

/**
 * 查询当前的用户列表
 */
public class ActivitiTaskQuery {
    public static void main(String[] args) {


        //lisi的任务查询
        //1.得到processEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.taskservice对象
        TaskService taskService = processEngine.getTaskService();
        //3.根据流程定义的key，负责人assign来实现当前用户的任务列表查询
        Task task = taskService.createTaskQuery()
                .processDefinitionKey("holiday")
                .taskAssignee("wangwu")
                .singleResult();
        //4.任务列表展示
            System.out.println("流程实例id ： "  + task.getProcessInstanceId());
            System.out.println("任务id：" + task.getId());
            System.out.println("任务负责人：" + task.getAssignee());
            System.out.println("任务名称：" + task.getName());




        //zhangsan任务列表的查询
       //1.得到processEngine对象
       /* ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.taskservice对象
        TaskService taskService = processEngine.getTaskService();
        //3.根据流程定义的key，负责人assign来实现当前用户的任务列表查询
        List<Task> taskList = taskService.createTaskQuery()
                .processDefinitionKey("holiday")
                .taskAssignee("zhangsan")
                .list();
        //4.任务列表展示
        for (Task task : taskList) {
            System.out.println("流程实例id ： "  + task.getProcessInstanceId());
            System.out.println("任务id：" + task.getId());
            System.out.println("任务负责人：" + task.getAssignee());
            System.out.println("任务名称：" + task.getName());
        }*/

    }
}
