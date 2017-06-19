pipeline {
  agent any
  stages {
    stage('TESTMSB') {
      steps {
        bat(script: '"\"${tool \'MSBuild\'}\" SolutionName.sln /p:Configuration=Release /p:Platform=\"Any CPU\" /p:ProductVersion=1.0.0.${env.BUILD_NUMBER}"', returnStatus: true, returnStdout: true)
      }
    }
  }
}