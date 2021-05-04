package org.grails.activity

import spock.lang.Specification
import org.activiti.engine.ProcessEngines

class ProcessEngineIntegrationTest extends Specification {

    /*
    following https://www.activiti.org/userguide/#configuration
     */
    void "it creates a process engine from the activiti xml"() {
        expect:
        ProcessEngines.getDefaultProcessEngine()
    }

}
