pipeline {
    agent any
    tools {
        maven 'MAVEN' // Specify the Maven tool name configured in Jenkins
    }
    stages {
        stage('Build Maven') {
            steps {
                script {
                    // Checkout the source code from the specified Git repository
                    git branch: 'main', url: 'https://github.com/PurnachandarReddy/Jenkins-docker.git'
                    // Build the Maven project
                    bat 'mvn clean install'
                }
            }
        }
        stage('Build Docker image') {
    steps {
        bat 'docker build -t jenkinsdocker2/jenkinsdockerintegration-0.0.1 .'
    }
}

stage('Push to Docker Hub') {
    steps {
        script {
            bat 'docker login -u kpcreddy -p Dattu@123'
            bat 'docker tag jenkinsdocker2/jenkinsdockerintegration-0.0.1 kpcreddy/dockjen2'
            bat 'docker push docker.io/kpcreddy/dockjen2'
        }
    }
}


    }
}
