pipeline{
    agent any
    
    stages{
        stage('SCM Checkout'){
        steps{
           echo 'Initializing the pipeline with GIT repository SC'
           git 'https://github.com/mrinalblr/spring-docker-sample.git'
        }
    }
    stage('Build'){
        steps{
            echo 'Building the Jar '
            sh 'mvn clean package'
            sh 'docker build . -t deomrinal/spring-docker-sample:1.0.0'
        }
    }
    }
    
}



