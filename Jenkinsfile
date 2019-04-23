pipeline {
    agent {
        docker { image 'node:8.16.0-alpine' }
    }
    stages {
        stage('test') {
            sh 'node --version'
        }
        stage('build') {
            steps {
                sh 'echo "Start Build"'
                retry(3) {
                    sh 'bash gradlew clean build'
                }

            }
        }
        stage('deploy') {
            steps {
                retry(3) {
                    sh 'bash echo.sh'
                }
                timeout(time:3, unit: 'MINUTES') {
                    sh 'bash health-check.sh'
                }
            }
             post {
                    always {
                        echo 'This will always run'
                    }
                    success {
                        echo 'This will run only if successful'
                    }
                    failure {
                        echo 'This will run only if failed'
                    }
                    unstable {
                        echo 'This will run only if the run was marked as unstable'
                    }
                    changed {
                        echo 'This will run only if the state of the Pipeline has changed'
                        echo 'For example, if the Pipeline was previously failing but is now successful'
                    }
                }
        }

    }
}

