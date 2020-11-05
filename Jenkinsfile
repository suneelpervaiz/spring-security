
node{

  stage('Checkout SCM'){ 
    git 'https://github.com/suneelpervaiz/spring-security-old'
  }
  stage('Compile-Package'){
    
    def mvnHome = tool name: 'Maven', type: 'maven'
    
    sh "${mvnHome}/bin/mvn package"
  }
  stage('Email notification'){
mail bcc: '', body: 'Hello world', cc: '', from: '', replyTo: '', subject: 'Jenkin job email', to: 'suneelpervaiz.uu@gmail.com'  }
  
  
  
  
  
  
  environment {
        //This variable need be tested as string
        doError = '1'
    }
   
    agent any
    
    stages {
        stage('Error') {
            when {
                expression { doError == '1' }
            }
            steps {
                echo "Failure"
                error "failure test. It's work"
            }
        }
        
        stage('Success') {
            when {
                expression { doError == '0' }
            }
            steps {
                echo "ok"
            }
        }
    }
    post {
        always {
            echo 'I will always say Hello again!'
            
            emailext body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}",
                recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
                subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}"
            
        }
    }
  
  
}
