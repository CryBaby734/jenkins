pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh './gradlew build' // Сборка проекта
                }
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    sh 'docker build -t blogcenter-app:latest .'
                }
            }
        }
        stage('Docker Run') {
            steps {
                script {
                    sh 'docker run -d -p 8080:8080 blogcenter-app:latest'
                }
            }
        }
    }
}
