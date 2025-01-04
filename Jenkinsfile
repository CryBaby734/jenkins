pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '/usr/local/bin/docker-compose build'
            }
        }
        stage('Test') {
            steps {
                sh '/usr/local/bin/docker-compose exec app ./run_tests.sh'
            }
        }
        stage('Deploy') {
            steps {
                sh '/usr/local/bin/docker-compose up -d'
            }
        }
    }

    post {
        always {
            sh '/usr/local/bin/docker-compose down'
        }
    }
}

