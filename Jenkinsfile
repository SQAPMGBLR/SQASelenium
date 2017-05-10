pipeline {
  agent any
  stages {
    stage('Checkout from SCM') {
      steps {
        echo 'Building Proj from SCM'
        git(url: 'https://github.com/SQAPMGBLR/SQASelenium.git', branch: 'master', credentialsId: 'sqapmgblr', poll: true)
      }
    }
  }
}
