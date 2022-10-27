pipeline {

    agent any
    /*agent {
        node {
            label ""
            customWorkspace "/var/lib/jenkins/workspace/Pipeline1/RefactorAdapterPattern"
        }
    }*/

    environment {
        NEW_VERSION = '1.0.0'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building version ${env.NEW_VERSION}'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing version ${NEW_VERSION}'
                //sh './gradlew test'
            }
            /*post {
                always {
                    junit allowEmptyResults: false, testResults: "build/reports/tests/test/*.html"
                }
            }*/
        }
    }
}