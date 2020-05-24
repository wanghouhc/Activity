package com.huangchuan.Activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

/**
 * 启动流程实例:前提是已经完成流程定义的部署工作
 */
public class ActiveStart {
    public static void main(String[] args) {
        //1.得到processEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到runtimeService
        RuntimeService runtimeService = processEngine.getRuntimeService();

        //3。创建流程实例
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("holiday");
        //4.输出实例的信息
        System.out.println("流程部署的ID:"+processInstance.getDeploymentId());
        System.out.println("流程定义的ID:"+processInstance.getProcessDefinitionId());
        System.out.println("流程实例的ID:"+processInstance.getId());
        System.out.println("活动的ID:"+processInstance.getActivityId());
    }
}
