pipeline {
    agent any

    stages {
        stage('Building') {
            steps {
                echo 'Building the project'
            }
        }
        stage('Testing') {
            steps {
                echo 'Testing the project'
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/D0rianGrey/Jenkins_Project.git']])
                sh 'gradle clean test'
            }
        }
        stage('Deploying') {
            steps {
                echo 'Deploying the code on sesrver'
            }
        }
    }
}
