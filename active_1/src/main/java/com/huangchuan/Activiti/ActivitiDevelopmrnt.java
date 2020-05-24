package com.huangchuan.Activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;

/**
 * 流程定义的部署
 * activiti的图有哪些
 * act_re_deployment 流程部署信息
 * act_ge_property  流程定义的一些信息
 * act_ge_bytearray 流程定义的bpmn文件及png文件
 *
 */
public class ActivitiDevelopmrnt {

    public static void main(String[] args) {
        //1.创建processEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到RepositoryService实例
        RepositoryService repositoryService = processEngine.getRepositoryService();
        //3.进行部署
       Deployment deployment= repositoryService.createDeployment()
                .addClasspathResource("diagram/holiday.bpmn")  //添加bpmn
                .addClasspathResource("diagram/holiday.png")  //添加png
                .name("请假申请流程")
                .deploy();   //部署
        //4.输出部署的一些信息
        System.out.println(deployment.getName());
        System.out.println(deployment.getId());
    }
}
